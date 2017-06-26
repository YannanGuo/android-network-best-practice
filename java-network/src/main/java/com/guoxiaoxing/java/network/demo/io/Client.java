package com.guoxiaoxing.java.network.demo.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * For more information, you can visit https://github.com/guoxiaoxing or contact me by
 * guoxiaoxingse@163.com.
 *
 * @author guoxiaoxing
 * @since 2017/6/8 下午5:43
 */
public class Client {


    private Socket socket;


    public Client(String host, int port) {
        try {
            socket = new Socket(host, port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private PrintWriter getPrintWriter(Socket socket) throws IOException {
        return new PrintWriter(socket.getOutputStream(), true);
    }

    private BufferedReader getBufferedReader(Socket socket) throws IOException {
        return new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }

    public void talk() {
        try {
            BufferedReader bufferedReader = getBufferedReader(socket);
            PrintWriter printWriter = getPrintWriter(socket);
            BufferedReader localReader = new BufferedReader(new InputStreamReader(System.in));
            String message = null;
            while ((message = localReader.readLine()) != null) {
                printWriter.println(message);
                if (message.equals("bye")) {
                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
