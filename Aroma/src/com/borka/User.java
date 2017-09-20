package com.borka;

/**
 * Created by borka on 9/16/2017.
 */
public class User {
    private String name;
    private String password;
    private String age;
    private String sign;


    public User(String name, String password,String age, String sign) {
        this.name = name;
        this.password = password;
        this.age = age;
        this.sign = sign;
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public User() {
        this.name = name;
        this.password = password;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", sign='" + sign + '\'' +
                '}';
    }
}