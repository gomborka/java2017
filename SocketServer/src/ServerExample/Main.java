package ServerExample;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            Socket client=null;
            while(true) {

                System.out.println("Waiting for connection...");
               client= serverSocket.accept();
                System.out.println("connected " + client.getInetAddress().getHostName() +  " " + client.isConnected());
              // new ClientThread(newClient).start();
               ClientThread newClient =new ClientThread(client);
                newClient.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
