package com.guoxiaoxing.socketio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.net.URISyntaxException;

import io.socket.client.IO;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connect();
    }

    private void connect() {

        Socket socket = null;

        try {
            socket = IO.socket("");
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        if (socket == null) {
            return;
        }

        socket.on(Socket.EVENT_CONNECT, new Emitter.Listener() {
            @Override
            public void call(Object... args) {

            }
        }).on(Socket.EVENT_DISCONNECT, new Emitter.Listener() {
            @Override
            public void call(Object... args) {

            }
        });

        socket.connect();
    }
}
