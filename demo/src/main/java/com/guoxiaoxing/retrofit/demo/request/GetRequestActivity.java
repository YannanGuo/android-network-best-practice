package com.guoxiaoxing.retrofit.demo.request;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.guoxiaoxing.retrofit.demo.R;
import com.guoxiaoxing.retrofit.demo.RetrofitApplication;
import com.guoxiaoxing.retrofit.demo.model.PhoneLocation;
import com.guoxiaoxing.retrofit.demo.service.PhoneLocationService;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GetRequestActivity extends AppCompatActivity implements View.OnClickListener {


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
        setContentView(R.layout.activity_request);
        ButterKnife.bind(this);

        mBtnQueryPhone.setOnClickListener(this);
    }

    private void queryPhoneLocation() {
        PhoneLocationService phoneLocationService = RetrofitApplication.getRetrofit().create(PhoneLocationService.class);
        Call<PhoneLocation> call = phoneLocationService.getResult(RetrofitApplication.API_KEY, mEtQueryPhone.getText().toString());
        call.enqueue(new Callback<PhoneLocation>() {
            @Override
            public void onResponse(Call<PhoneLocation> call, Response<PhoneLocation> response) {

                if (response.isSuccessful()) {
                    PhoneLocation phoneLocation = response.body();
                    if (phoneLocation != null) {
                        mTvShowResult.setText(phoneLocation.getRetData().getProvince() + "/" + phoneLocation.getRetData().getCity());
                    }
                }
            }

            @Override
            public void onFailure(Call<PhoneLocation> call, Throwable t) {
                Toast.makeText(GetRequestActivity.this, t.getMessage().toString(), Toast.LENGTH_LONG).show();

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
