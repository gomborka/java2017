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
     public static final String FILEPATH ="C:\\boris\\";

    public static void main(String[] args) {


       int answer = JOptionPane.showOptionDialog(null,"Exist user?","Login", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null);

        switch (answer){

            case 0 :
               login();
                break;
            case 1 :
                registration();
                 break;

            case -1 :
                JOptionPane.showMessageDialog(null,"Try it again");
                break;
        }
}

    private static void login() {
        User user = new User();
        String  name =JOptionPane.showInputDialog("Enter username");
        String  password =JOptionPane.showInputDialog("Enter password");

        JSONArray array = getUserList();


        for (int i = 0; i < array.length(); i++) {
            JSONObject json= null;
            try {
                json = array.getJSONObject(i);
                if (json.getString("name").equals(name) && json.getString("password").equals(password)) {
                   //chooseProduct();
                    System.out.println("Correct");
                }
                else
                    System.out.println("Not correct");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

    }



    public static void registration()
  {
      User user = new User();
      String  name =JOptionPane.showInputDialog("Enter username");

      user.setName(name);
      user.setPassword(JOptionPane.showInputDialog("Enter password"));
      user.setAge(JOptionPane.showInputDialog("Enter age"));
      user.setSign(JOptionPane.showInputDialog("Enter Zodiak sign"));
      createUser(user);

  }
////////////////////////////////////////////////////////////////////
  public static boolean userExist(String username, JSONArray arr)
  {

          for (int i = 0; i < arr.length(); i++) {
              JSONObject json= null;
              try {
                  json = arr.getJSONObject(i);
                  if (json.getString("name").equals(username)) {
                      return true;
              }
              } catch (JSONException e) {
                  e.printStackTrace();
              }
          }

     return false;

  }
//////////////////////////////////////////////////////////
  public static JSONArray getUserList() {
      JSONArray array = null;
      File file = new File(FILEPATH + "//" + usersFile);

       String text="";
         try {
          BufferedReader  in = new BufferedReader(new FileReader(file));
             StringBuilder sb = new StringBuilder();

              while((text=in.readLine())!=null)
              {
                  sb.append(text);
              }


         array = new JSONArray(sb.toString());

      } catch (IOException e1) {
          e1.printStackTrace();
      } catch (JSONException e) {
             e.printStackTrace();
         }
      return array;
  }


////////////////////////////////////////////////////////////////////
    public static void createUser(User user) {

        ArrayList<User> arr2 = new ArrayList<>();
        File file = new File(FILEPATH + "\\" + usersFile);
        try {

            if (!file.exists()) {
                file.createNewFile();

                arr2.add(user);
               JSONArray array = new JSONArray(arr2);

                updateUserFile(array);
            } else {

                JSONArray arr = getUserList();
                if (!userExist(user.getName(),arr)) {

                    JSONObject jsonObject = new JSONObject(user);
                    arr.put(jsonObject);
                    updateUserFile(arr);
                }
                else
                {
                    System.out.println("User already Exist");
                }
            }

            } catch(IOException e){
                e.printStackTrace();

            }
        }

//////////////////////////////////////////////////////////////////////////
    public static void updateUserFile(JSONArray array){


        BufferedWriter out  = null;
        String content = array.toString();

        File file = new File(FILEPATH+"\\"+ usersFile);

        try {
            out = new BufferedWriter(new FileWriter(file));
            out.write(content);
            System.out.println("content " + content);
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
