package com.borka;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Comp14 on 12/09/2017.
 */
public class MainFileAppend {
    public static void main(String[] args) {

        File file = new File("data.txt");

        for (int i = 0; i < 4; i++) {

            try {
                FileOutputStream out = new FileOutputStream(file,true);
                out.write(("hello Boris"+i+"\n").getBytes());
                System.out.println("done");

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
