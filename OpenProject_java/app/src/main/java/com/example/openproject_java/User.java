package com.example.openproject_java;

//유저의 정보를 저장하는 객체
//2018038092 안준
public class User {

    public String user_name;
    public String user_pw;
    public String user_phone;
    public Object myPlant; // Plant 객체를 저장하는 멤버
    //public Object flowerpot;


    public User() {

        this.user_name = null;
        this.user_pw = null;
        this.user_phone = null;
        this.myPlant = null;
    }

    public User(String user_name, String user_pw ,String user_phone ){
        this.user_name = user_name;
        this.user_pw = user_pw;
        this.user_phone = user_phone;
        this.myPlant = null;
    }
}
