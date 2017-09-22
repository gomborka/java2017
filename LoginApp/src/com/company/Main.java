package com.company;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import javax.swing.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;


public class Main {
   // static ArrayList<User> userList = new ArrayList<User>();
    public static String usersFile = "users.txt";
    public static final String FILEPATH = "C:\\boris\\shop";

    public static void main(String[] args) {

        int answer = JOptionPane.showOptionDialog(null, "Exist user?", "Login", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);

        switch (answer) {

            case 0:
                login();
                break;
            case 1:
                registration();

                break;

            case -1:
                JOptionPane.showMessageDialog(null, "Try it again");
                break;
        }
    }

    private static void login() {

        String name = JOptionPane.showInputDialog("Enter username");
        String password = JOptionPane.showInputDialog("Enter password");

        JSONArray array = getUserList();
        boolean userFound = false;

        for (int i = 0; i < array.length(); i++) {
            JSONObject json = null;
            try {
                json = array.getJSONObject(i);
                if (json.getString("name").equals(name) && json.getString("password").equals(password)) {
                    User user = new User();
                    user.setName(name);
                    user.setPassword(password);
                    chooseAction(user);
                    userFound = true;
                }

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (userFound == false) {
            JOptionPane.showMessageDialog(null, "Not corect");
        }
    }

    public static void registration() {
        User user = new User();

        user.setName(JOptionPane.showInputDialog("Enter username"));
        user.setPassword(JOptionPane.showInputDialog("Enter password"));
        createUser(user);

        JOptionPane.showMessageDialog(null, "Registration is Done");
        login();
    }

    ////////////////////////////////////////////////////////////////////
    public static boolean userExist(String username, JSONArray arr) {

        for (int i = 0; i < arr.length(); i++) {
            JSONObject json = null;
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


        String text = "";
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            StringBuilder sb = new StringBuilder();

            while ((text = in.readLine()) != null) {
                sb.append(text);
            }
            array = new JSONArray(sb.toString());

//            ArrayList<String> list = new ArrayList<String>();
//            array = new JSONArray(sb.toString());
//            if (array != null) {
//                for (int i=0;i<array.length();i++){
//                    list.add(array.get(i).toString());
//                }
//            }

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
                if (!userExist(user.getName(), arr)) {

                    JSONObject jsonObject = new JSONObject(user);
                    arr.put(jsonObject);
                    updateUserFile(arr);
                } else {
                    System.out.println("User already Exist");
                }
            }

            File userDir = new File(FILEPATH+"\\"+user.getName());
            userDir.mkdir();

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
     ////////////////////////////////////////////////////////////////////////////////////
//    public static void createTXT(String user)
//    {
//        File file = new File(FILEPATH+"\\"+user+".txt");
//        try {
//            file.createNewFile();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//    }
    //////////////////////////////////////////////////////////////////////////
    public static void updateUserFile(JSONArray array) {


        BufferedWriter out = null;
        String content = array.toString();

        File file = new File(FILEPATH + "\\" + usersFile);

        try {
            out = new BufferedWriter(new FileWriter(file));
            out.write(content);
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
////////////////////////////////////////////////////////////////
    public static void chooseAction(User user) {

        String[] options = {"Buy product", "Show product", "Delete user"};


        int option = JOptionPane.showOptionDialog(null, "Choose any option: ", "Actions", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);
        switch (option) {

            case 0: {
                     buyProduct(user);

                break;
            }
            case 1: {
                      showProduct(user);
                break;
            }
            case 2: {
                deleteShopCart(user);
               deleteUser(user);
                break;
            }
            case -1: {
                System.out.println("Try this option again");
                break;
            }
        }
    }
//////////////////////////////////////////////////////////////
  public static void buyProduct(User user)
  {
      boolean isContinue= true;
      String [] food ={"pasta","pizza","suschi","stake","humus"};

      ArrayList<String> shopCart = new ArrayList<>();
      StringBuilder sb = new StringBuilder();

     while (isContinue) {


//         switch (products) {
//             case "pasta": {
//                 sb.append(products+"\n")
//                 break;
//             }
//             case "pizza": {
//                 shopCart.add("pizza");
//                 break;
//             }
//
//             case "suschi": {
//                 shopCart.add("suschi");
//                 break;
//             }
//
//             case "stake": {
//                 shopCart.add("stake");
//                 break;
//             }
//             default:
//                 System.out.println("Hard day ???");
//                 break;
//         }
         String products = (String)JOptionPane.showInputDialog(null,"Buy any prodcut : ","Products",JOptionPane.QUESTION_MESSAGE,null,food,food[0]);
         sb.append(products+"\n");
         int answer = JOptionPane.showOptionDialog(null, "Continue to buy?", "Shopping", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
         if (answer!=0) {
             isContinue = false;
         }
     }

     saveShopCart(sb,user);
  }
/////////////////////////////////////////////////////////////////////
  public static void showProduct(User user){
        File folder= new File (FILEPATH+"//"+user.getName());
      File [] items = folder.listFiles();


      for (int i = 0; i < items.length; i++) {

          File file = new File (items[i].toString());
           try {
            BufferedReader in = new BufferedReader( new FileReader(file));
              StringBuilder sb = new StringBuilder();
              String text ="";
              while ((text = in.readLine())!= null)
              {
               sb.append(text);
               sb.append("\t");
              }
              System.out.println(items[i].getName() + " : " + sb.toString());

          } catch (FileNotFoundException e) {
              e.printStackTrace();
          } catch (IOException e) {
              e.printStackTrace();
          }


      }
  }
////////////////////////////////////////////////////////////
  public static void deleteUser(User user)
  {
     JSONArray userlist = new JSONArray();
      userlist=getUserList();
  //    ArrayList<String> list = new ArrayList<String>();
      JSONArray updatedList = new JSONArray();
      for (int i = 0; i < userlist.length(); i++) {
          JSONObject json = null;
          try {
              json = userlist.getJSONObject(i);
              if (!(json.getString("name").equals(user.getName()))) {
                  updatedList.put(json);
              }
          } catch (JSONException e) {
              e.printStackTrace();
          }
      }
      updateUserFile (updatedList);
    }
////////////////////////////////////////////////////////////
  public static void  deleteShopCart(User user)
  {
      File folder = new File (FILEPATH+"//"+user.getName());
      System.out.println("Folder to del " + folder.toString());

      String[]items = folder.list();
      for(String curr: items){
          System.out.println("curr" + curr);
          File currentFile = new File(folder.getPath(),curr);
          currentFile.delete();
               }

       folder.delete();
  }

  ////////////////////////////////////////////////////////////
 public static void saveShopCart(StringBuilder sb,User user){
     Calendar c = Calendar.getInstance();
     SimpleDateFormat date1 = new SimpleDateFormat("dd-MM-yyyy");
     SimpleDateFormat time2 = new SimpleDateFormat("hh_mm_ss");
     String myhour = time2.format(c.getTime());
     System.out.println(myhour);

     File file = new File(FILEPATH+"//"+ user.getName()+"//" +myhour+".txt");

     try {
         BufferedWriter out = new BufferedWriter(new FileWriter(file));
         out.write(sb.toString());

         out.close();

     } catch (IOException e) {
         e.printStackTrace();
     }

 }
}