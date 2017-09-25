package InteractiveServer;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * Created by borka on 9/20/2017.
 */
public class MainCapitalizedResponse {

    public static void main(String[] args) {
        int clientNumber = 0;
        try {
            ServerSocket listener = new ServerSocket(9090);

            while (true)
            {
                new Capitalizer(listener.accept(),clientNumber++).start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
