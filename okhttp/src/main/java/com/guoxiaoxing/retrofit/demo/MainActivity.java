package com.guoxiaoxing.retrofit.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.guoxiaoxing.retrofit.demo.request.GetRequestActivity;
import com.guoxiaoxing.retrofit.demo.request.PostRequestActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.tv_get_request)
    Button mTvGetRequest;
    @BindView(R.id.tv_post_request)
    Button mTvPostRequest;
    @BindView(R.id.activity_main)
    ConstraintLayout mActivityMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mTvGetRequest.setOnClickListener(this);
        mTvPostRequest.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.tv_get_request:
                startActivity(new Intent(MainActivity.this, GetRequestActivity.class));
                break;
            case R.id.tv_post_request:
                startActivity(new Intent(MainActivity.this, PostRequestActivity.class));
                break;
            default:
                break;
        }
    }

}
