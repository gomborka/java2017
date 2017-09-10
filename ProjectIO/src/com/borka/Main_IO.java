package com.borka;

import java.io.*;

public class Main_IO {

    public static void main(String[] args) {

   File file1 = new File("C:\\boris\\data.txt");

   /////////////// TODO: Example 1 ////////////////////

   String content = "Hello class wassup "+"\n" +"New Line";
   byte[] bufferOut = content.getBytes();


        try {
            file1.createNewFile();
            FileOutputStream out = new FileOutputStream(file1);
            out.write(bufferOut);
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream in = new FileInputStream(file1);
            StringBuilder sb =new StringBuilder();
            byte [] bufferIn = new byte[1024];
         //   String text = "";
            int actuallyReady=0;

            while((actuallyReady = in.read(bufferIn))!=-1){
         //   text += new String(bufferIn,0,actuallyReady);
                sb.append(new String(bufferIn,0,actuallyReady));

            }
            System.out.println(sb.toString());

            if (sb.toString().contains("wassup"))
            {
                System.out.println("Yes it is");
            }

            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }




    }
}
