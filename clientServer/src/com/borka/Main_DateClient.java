package com.borka;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by borka on 9/20/2017.
 */
public class Main_DateClient {

    public static void main(String[] args) {
        String serverAddress = "192.168.1.13";
        try {
            Socket s = new Socket(serverAddress, 9090);
            BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String answer = input.readLine();
            System.out.println("Server Answer : " + answer);
            System.exit(0);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
