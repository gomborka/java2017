package com.borka;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    private static String message;

    public static void main(String[] args) {
	String ip = "192.168.1.13";
	int port =5000;
        OutputStream out=null ;

        try {
            while(true) {
                Socket client = new Socket(ip, port);
               Scanner scanner = new Scanner(System.in);
                message = scanner.nextLine();
          //      message="Welocme ";
                out = client.getOutputStream();
                while (!message.equals("end")) {
                    out.write(message.getBytes());
                }
                 out.close();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
