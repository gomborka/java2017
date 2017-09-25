package DateServerExample;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * Created by borka on 9/20/2017.
 */
public class DateServer {

    public static void main(String[] args) throws IOException {
        ServerSocket listener = new ServerSocket(9090);
        Socket socket = null;

   try {

        while (true) {
            socket = listener.accept();
            System.out.println("Listener accepted");
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

                out.println(new Date().toString());
        }

        }
         catch (IOException e) {
               e.printStackTrace();
           }
           finally {
               socket.close();
               listener.close();
           }
        }
  }

