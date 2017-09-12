package com.borka;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Comp14 on 10/09/2017.
 */
public class MainBufferIO {
    public static void main(String[] args) {
         String startPath= "C:\\boris\\";
         String nameFolder = "testFolder";
        File myOutDir = new File(startPath+"\\"+nameFolder);
        File insideOutDir = new File(myOutDir.getAbsolutePath()+"\\"+nameFolder);
        String fileName = "FileTest";

        myOutDir.mkdir();
        insideOutDir.mkdir();
        System.out.println();
        File readFile = new File(startPath+"\\"+fileName+".txt");

        String text= "";
        StringBuilder sb = new StringBuilder();

//        try {
//            FileInputStream fis = new FileInputStream(readFile);
//            InputStreamReader reader = new InputStreamReader(fis);
//            BufferedReader bis = new BufferedReader(reader);
//
//            BufferedReader buffReader = new BufferedReader(new InputStreamReader( new FileInputStream(readFile)));
//            while ((text = buffReader.readLine())!=null)
//            {
//                sb.append(text);
//                System.out.println(sb);
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        String text2;
        try {
            FileInputStream in = new FileInputStream(readFile);
            BufferedReader buffReader = new BufferedReader(new InputStreamReader(in));
            StringBuilder sb2 = new StringBuilder();


            while((text2=buffReader.readLine())!=null)
            {
                sb.append(text2);
                sb.append("\n");
            }

            for (int i = 0; i < 100; i++) {

                 File copiedFile = new File(insideOutDir.getAbsolutePath()+"\\"+fileName+i +".txt");
               //  System.out.println(copiedFile);
                 FileOutputStream out = new FileOutputStream(copiedFile);
                 out.write(sb.toString().getBytes());
                 out.close();
            }

            in.close();
            System.out.println("Creation Done");
            // TODO delete example
            File deleteFile = new File(insideOutDir.getAbsolutePath()+"\\"+fileName+"50.txt");
            deleteFile.delete();

            printAllFiles(insideOutDir);
            deleteAllFiles(insideOutDir);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public static void printAllFiles( File folder)
    {

        //TODO example print name of files
        List<String> results = new ArrayList<String>();
        File[] files = folder.listFiles();

        for (File curr : files) {
            System.out.println(curr.getName());
        }
        System.out.println("Print Done");
    }

    public static void deleteAllFiles( File folder)
    {


        List<String> results = new ArrayList<String>();
       // File[] files = new File(folder.getAbsolutePath()).listFiles();
        File[] files = folder.listFiles();

        for (File curr : files) {

            try {
                curr.delete();
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Delete Done");
    }
}
