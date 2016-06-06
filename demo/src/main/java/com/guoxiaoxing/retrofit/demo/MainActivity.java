package com.guoxiaoxing.retrofit.demo;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String BASE_UEL = "http://apis.baidu.com";
    private static final String API_KEY = "23be4be008e230689f5c7a95f9a5fc9e";

    @BindView(R.id.et_query_phone)
    EditText mEtQueryPhone;
    @BindView(R.id.btn_query_phone)
    Button mBtnQueryPhone;
    @BindView(R.id.tv_show_result)
    TextView mTvShowResult;
    @BindView(R.id.activity_main)
    ConstraintLayout mActivityMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mBtnQueryPhone.setOnClickListener(this);
    }

    private void queryPhoneLocation() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_UEL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        PhoneService phoneService = retrofit.create(PhoneService.class);
        Call<Phone> call = phoneService.getPhoneLocation(API_KEY, mEtQueryPhone.getText().toString());
        call.enqueue(new Callback<Phone>() {
            @Override
            public void onResponse(Call<Phone> call, Response<Phone> response) {

                if (response.isSuccessful()) {
                    Phone phone = response.body();
                    if (phone != null) {
                        mTvShowResult.setText(phone.getRetData().getProvince() + "/" + phone.getRetData().getCity());
                    }
                }
            }

            @Override
            public void onFailure(Call<Phone> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage().toString(), Toast.LENGTH_LONG).show();

            }
        });
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.btn_query_phone:
                queryPhoneLocation();
                break;
        }

    }
}
