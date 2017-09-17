package com.company;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class Main {
    static ArrayList<User> userList = new ArrayList<User>();
     public static String usersFile = "users.txt";

    public static void main(String[] args) {


       int answer = JOptionPane.showOptionDialog(null,"Exist user?","Login", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);

        switch (answer){

            case 0 :
               // printDetails();
                break;
            case 1 :
                registration();
                 break;

            case -1 :
                JOptionPane.showMessageDialog(null,"Try it again");
                break;
        }

}

    private static void printDetails() {



    }

    public static void registration()
  {

      User user = new User();
      String  name =JOptionPane.showInputDialog("Enter username");

          while (userExist(name))
          {
              JOptionPane.showMessageDialog(null,"User alreaydy exist, try new");
              name =JOptionPane.showInputDialog("Enter username");
          }

      user.setName(name);
      user.setPassword(JOptionPane.showInputDialog("Enter password"));
      user.setAge(JOptionPane.showInputDialog("Enter age"));
      user.setSign(JOptionPane.showInputDialog("Enter Zodiak sign"));

      JSONObject jsonUser = new JSONObject(user);
      System.out.println(jsonUser);

      insertToFile(jsonUser);
  }


  public static boolean userExist(String username)
  {

      File file = new File(usersFile);
      try {
          BufferedReader in = new BufferedReader(new FileReader(file));
          while((in.readLine())!=null)
          {
              in.read();
          }

          JSONArray array = new JSONArray(in.toString());
          for (int i = 0; i < array.length(); i++) {
              JSONObject json= array.getJSONObject(i);
              if (json.getString("name").equals(username)) {
                  return true;
              }
            }
      } catch (FileNotFoundException e) {
          e.printStackTrace();
      } catch (IOException e) {
          e.printStackTrace();
      } catch (JSONException e) {
          e.printStackTrace();
      }

      return false;

  }

    public static void insertToFile(JSONObject jsonObject)
   {BufferedWriter out  = null;
       System.out.println("Json  "+jsonObject.toString());
       String content= jsonObject.toString();

        File file = new File(usersFile);

            try {

                if (!file.exists()){
                    file.createNewFile();
                   }
                out = new BufferedWriter(new FileWriter(file.getAbsoluteFile(), true));
                out.write(content);
                System.out.println("content " + content);

            } catch (IOException e) {
                e.printStackTrace();
            }

    finally {
           try {
               out.close();
           } catch (IOException e) {
               e.printStackTrace();
           }

       }
  }

}
