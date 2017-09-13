package com.borka;

import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONException;
import org.json.JSONObject;
import sun.plugin.javascript.JSObject;
import org.json.JSONArray;

public class Main {

    public static void main(String[] args) throws JSONException {

//       String j1 = " { \"name\":\"John\", \"age\":31, \"city\":\"New York\" };";
//
//        try {
//            JSONObject example1= new JSONObject(j1);
//            String name= example1.getString("name");
//            System.out.println(name);
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }

//        String jArray= "{" + "\"name\":\"John\"," +"\"age\":30," +"\"cars\":[ \"Ford\", \"BMW\", \"Fiat\" ]" + "}";
//        try {
//            JSONObject mainObject  = new JSONObject(jArray);
//            JSONArray arr = mainObject.getJSONArray("cars");
//            for (int i = 0; i <arr.length() ; i++) {
//                System.out.println(arr.getString(i));
//            }
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }

        String array = "[{\"name\":\"John\",\"age\":30}, {\"name\":\"Yossi\",\"age\":50}," +
                "{\"name\":\"Tzur\",\"age\":20,\"movies\":[\"lord rings\",\"matrix\",\"pie\"]}]";

        JSONArray myArr = new JSONArray(array);

        for (int i = 0; i < myArr.length(); i++) {

            JSONObject object = myArr.getJSONObject(i);
          //  System.out.println(object.toString());
            if (object.getString("name").equals("Tzur")) {
                System.out.println(object.get("name") + " likes : ");


                JSONArray myArr2 = object.getJSONArray("movies");

                for (int j = 0; j < myArr2.length(); j++) {

                    System.out.println(myArr2.getString(j));
                }


            }

        }
    }
    }

