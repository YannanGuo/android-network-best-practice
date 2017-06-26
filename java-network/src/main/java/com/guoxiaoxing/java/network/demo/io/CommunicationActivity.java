package com.guoxiaoxing.java.network.demo.io;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.guoxiaoxing.java.network.demo.R;

public class CommunicationActivity extends AppCompatActivity implements View.OnClickListener {

    private String host = "localhost";
    private int port = 8000;

    private EditText mEtServer;
    private Button mBtnServer;
    private EditText mEtClient;
    private Button mBtnClient;
    private Button mBtnConnection;
    private TextView mTvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_communication);
        setupView();
        setupData();
    }

    private void setupView() {
        mEtServer = (EditText) findViewById(R.id.et_server);
        mBtnServer = (Button) findViewById(R.id.btn_server);
        mEtClient = (EditText) findViewById(R.id.et_client);
        mBtnClient = (Button) findViewById(R.id.btn_client);
        mBtnConnection = (Button) findViewById(R.id.btn_connection);
        mTvMessage = (TextView) findViewById(R.id.tv_message);

        mBtnServer.setOnClickListener(this);
        mBtnClient.setOnClickListener(this);
        mBtnConnection.setOnClickListener(this);
    }

    private void setupData() {
       Server server = new Server(port);
        Client client = new Client()
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_server:

                break;
            case R.id.btn_client:

                break;
            case R.id.btn_connection:

                break;
        }
    }

}
