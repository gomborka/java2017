package com.borka;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Comp14 on 12/09/2017.
 */
public class Main_CopyWeb {

    public static void main(String[] args) {


        String pathHTML ="http://www.ynet.co.il/home/0,7340,L-8,00.html";
       String pathImage ="http://static.boredpanda.com/blog/wp-content/uuuploads/landscape-photography/landscape-photography-28.jpg";
        File myImageFromWeb =new File("myImage.jpg");
        File myHtmlFromWeb =new File("myHTML.html");

        try {
 //           URL url = new URL(pathImage);
 //          HttpURLConnection connection = (HttpURLConnection)url.openConnection();
//            InputStream in = connection.getInputStream();
//            FileOutputStream out = new FileOutputStream(myImageFromWeb);
//            byte [] buffer =new byte[1024];
//            int actuallyRead=0;
//            while ((actuallyRead=in.read(buffer))!=-1)
//            {
//                out.write(buffer,0,actuallyRead);
//            }
            //  in.close();

            URL url = new URL(pathHTML);
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            FileOutputStream out = new FileOutputStream(myHtmlFromWeb);
            StringBuilder sb = new StringBuilder();
            String text= "";
            while ((text= reader.readLine())!=null)
            {
                sb.append(text);
            }
            out.write(sb.toString().getBytes());
            System.out.println("done copying");

            reader.close();
            out.close();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }





    }
}
