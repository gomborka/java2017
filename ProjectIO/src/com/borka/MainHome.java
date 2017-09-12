package com.borka;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Comp14 on 11/09/2017.
 */
public class MainHome {

    static String content = "This is line #1 \n this line #2";
    static File myDir = new File("C:\\boris\\misc");
    static File file = new File (myDir.toString()+"\\data.txt");
    public static void main(String[] args) {




///////////////Create TXT with content ////////////
        byte[] buffer = content.getBytes();
        try {
            file.createNewFile();
            System.out.println("file"+file);
            BufferedWriter out = new BufferedWriter( new OutputStreamWriter( new FileOutputStream(file)));

            out.write(content);
            out.close();
            System.out.println("Write Done !!!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

       copyFiles(myDir);

    }

    public static void copyFiles(File folder)  {

        File [] items = folder.listFiles();

        File copyDir = new File ("C:\\boris\\copied\\");
        copyDir.mkdir();
        System.out.println("CopyDir:" + copyDir);

        for (int i = 0; i < items.length; i++)  {

        System.out.println("AAA: "+items[i].toString());
            String pathDir= null;

            try {

                File newFile =new File(copyDir+"\\"+items[i].getName().toString());
                System.out.println(" newFIletoStr :" + newFile.toString());


                newFile.createNewFile();
                int actuallyRead ;
                byte [] buffer = new byte[1024];

                FileInputStream in = new FileInputStream(items[i]);
               FileOutputStream out = new FileOutputStream(newFile);

                while((actuallyRead = in.read(buffer))!=-1)
                {
                    System.out.println("inside while newFile : " +newFile.toString());
                 out.write(buffer,0,actuallyRead);

                }
                in.close();
               out.close();


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
        System.out.println("Print Done !!! ");
    }
}
