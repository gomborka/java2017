package com.borka;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import static com.borka.CopyWebTarg.copyFolder;

/**
 *         https://img.ksp.co.il/item/42000/m_1.jpg
        https://img.ksp.co.il/item/42118/m_1.jpg
 */
public class CopyWebTarg {
    static String pathLocal ="C:\\boris";
    static String folderName="\\ksp";
    static String pathLocalCopied=pathLocal+folderName;
    static File folderPath = new File(pathLocalCopied);

    public static void main(String[] args) {
        String  fullPath= null;
        String fullPathLocal=null;
        String pathGlobal = "https://img.ksp.co.il/item/";
        String filename = "m_1.jpg";

        for (int i = 42000; i <42118; i++) {

        fullPath= pathGlobal+i+"/"+filename;
        fullPathLocal=pathLocalCopied+"\\"+i+"_"+filename;

        File file = new File(fullPathLocal);
            try {
                URL url = new URL(fullPath);
                HttpURLConnection connection = (HttpURLConnection)url.openConnection();
                InputStream in = connection.getInputStream();
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file));
                byte [] buffer = new byte [1024];
                int actuallyRead=0;
                while((actuallyRead=in.read(buffer))!=-1)
                {
                    out.write(buffer,0,actuallyRead);
                }

                System.out.println("Downloaded to : "+file.toString());
                in.close();
                out.close();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        for (int i = 0; i <= 4; i++) {
            copyFolder(folderPath,i);
        }
    }
///////////////////// oopyFolder /////////////
     public static void copyFolder(File folder,int i)
     {
         File [] items = folder.listFiles();
         File copyDir = new File (pathLocalCopied+i);
         copyDir.mkdir();

          for (int j = 1; j < items.length ; j++) {

             File newFile = new File (copyDir+"\\"+ items[j].getName().toString());
             System.out.println(" newFile : " +newFile.toString());

             try {
                 newFile.createNewFile();
                 int actuallyRead ;
                 byte [] buffer = new byte[1024];
                 FileInputStream in = new FileInputStream(items[j]);
                 FileOutputStream out = new FileOutputStream(newFile);
                 while((actuallyRead = in.read(buffer))!=-1)
                 {
                     out.write(buffer,0,actuallyRead);
                 }
                 in.close();
                 out.close();

             } catch (IOException e) {
                 e.printStackTrace();
             }
         }
     }

}
