package com.borka;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sun.plugin.javascript.JSObject;

import static com.borka.MainJsonFromWeb.downloadImage;

/**
 * Created by Comp14 on 13/09/2017.
 */
public class MainJsonFromWeb {

     static String localPath = "C:\\boris\\sportNews";

    public static void main(String[] args) {

        String pathJSON ="http://haderajson.1apps.com/";

        ////////////// Download JSON ////////////////////////
        try {
            URL url = new URL(pathJSON);
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            BufferedReader reader = new BufferedReader (new InputStreamReader(conn.getInputStream()));
           StringBuilder sb = new StringBuilder ();
            String text ="";
            while((text=reader.readLine())!=null)
            {
                sb.append(text);
            }
   //         System.out.println(sb.toString());
            parseJSON (sb);
            reader.close();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void parseJSON (StringBuilder sb)
    {

    try {
        JSONObject jsonFull = new JSONObject(sb.toString());
        JSONArray mainArray = jsonFull.getJSONArray(("sportNews"));
        //      System.out.println(mainArray);

        for (int i = 0; i < mainArray.length(); i++) {
            JSONObject tempObject = mainArray.getJSONObject(i);

            String nameSubject = tempObject.getString("subject");
          //  System.out.println(nameSubject);
            File innerFolder = new File(localPath + "\\" + nameSubject);
            innerFolder.mkdir();

            String urlName = tempObject.getString("image");
          //  System.out.println(urlName);
            String time = tempObject.getString("time");
         //   System.out.println(time);

            downloadImage(urlName, nameSubject);
            createTXT(nameSubject, time);
        }
    }
          catch (JSONException e) {
            e.printStackTrace();
        }
    }

  public static void downloadImage (String link,String name)
  {
      try {
          URL url = new URL(link);
          HttpURLConnection connection = (HttpURLConnection)url.openConnection();
           InputStream in = connection.getInputStream();
            FileOutputStream out = new FileOutputStream(localPath+"\\"+name+"\\"+name+".jpg");
      //    System.out.println(localPath+"\\"+name+".jpg");
            byte [] buffer = new byte [1024];
            int actuallyRead;

            while ((actuallyRead = in.read(buffer))!=-1)
            {
                out.write(buffer,0,actuallyRead);
            }
      out.close();

      } catch (MalformedURLException e) {
          e.printStackTrace();
      } catch (IOException e) {
          e.printStackTrace();
      }
  }

  public  static void createTXT(String name, String time){

        File fileTXT = new File(localPath+"\\"+name+"\\"+name+".txt");
      try {
          fileTXT.createNewFile();
          BufferedWriter out = new BufferedWriter( new OutputStreamWriter( new FileOutputStream(fileTXT)));

          out.write(name + " starts at " + time);
          out.close();

      } catch (IOException e) {
          e.printStackTrace();
      }
  }
}


