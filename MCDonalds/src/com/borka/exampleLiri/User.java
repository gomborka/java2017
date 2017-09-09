package com.borka.exampleLiri;

import java.util.HashMap;

/**
 * Created by Comp14 on 07/09/2017.
 */
public class User {

    static HashMap<String, String> users = createUsers();

    private static HashMap <String, String> createUsers()
    {
        users = new HashMap<>();
        users.put ("liri", "123");
        users.put ("boris", "123");
        users.put ("gil", "123");
        return users;
    }

}
