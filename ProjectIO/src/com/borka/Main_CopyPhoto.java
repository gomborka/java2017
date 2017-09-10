package com.borka;

import java.io.*;

/**
 * Created by Comp14 on 10/09/2017.
 */
public class Main_CopyPhoto {
    public static void main(String[] args) {

        File original = new File("C:\\boris\\WebTranning\\img\\perah1.jpg");
        File myImage = new File("myImage.jpg");

        try {
            FileInputStream in = new FileInputStream(original);
            FileOutputStream out = new FileOutputStream(myImage);
            byte [] buffer = new byte [1024];
            int actualRead;
            while ((actualRead=in.read(buffer))!=-1)
            {
                out.write(buffer,0,actualRead);
            }
            in.close();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
