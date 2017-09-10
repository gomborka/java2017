package com.borka;

import java.io.*;

/**
 * Created by Comp14 on 10/09/2017.
 */
public class MainTargil_IO {

    public static void main(String[] args)  {


    File file1 = new File ("C:\\boris\\targIO.txt");
    File file2 = new File ("C:\\Users\\Comp14\\Desktop\\targIO_final.txt");
    String content1 = "Boris Goman";
    String content2 = " old 43";



        try {
            byte [] bufferOut = content1.getBytes();
            file1.createNewFile();
            FileOutputStream out = new FileOutputStream(file1);

            out.write(bufferOut);
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

//////////////// Read ////////////////


        byte [] bufferIn = new byte[1024];
        int actualRead=0;
        try {
            StringBuilder sb = new StringBuilder();
            FileInputStream fis = new FileInputStream(file1);
            while((actualRead = fis.read(bufferIn))!=-1)
            {
                sb.append(new String(bufferIn,0,actualRead));
            }

            fis.close();
          ////// Write new file ////

            String str3 =sb.toString()+content2;
            byte [] bufferOut = str3.getBytes();

            file2.createNewFile();
            FileOutputStream fos = new FileOutputStream(file2);
           fos.write(bufferOut);
            fos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}