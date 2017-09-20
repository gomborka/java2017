package com.borka;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by Comp14 on 19/09/2017.
 */
public class ClientThread extends Thread{

    private Socket client;
    InputStream in;
    private String msg="";

    public ClientThread(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {

        while (!msg.equals(client.getInetAddress().getHostName()+ ": end")) {
            try {
                in = client.getInputStream();
                msg = getMessage(in);

                if (msg.equals(client.getInetAddress().getHostName()+ ": end"))
                {
                    break;
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            client.close();
            System.out.println(client.getInetAddress().getHostName()+ " left conversation ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   public String getMessage(InputStream in) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        StringBuilder sb = new StringBuilder();
        //String msg ="";
        while((msg=reader.readLine())!= null)
        {
            sb.append(msg);
        }
        return sb.toString();
    }

}
