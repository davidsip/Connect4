package com.example.david.assignment2;

/**
 * Created by David on 11/5/2017.
 */


public class Data {
    private String string;
    private static final Data objectHolder = new Data();
    public String getString(){
        return objectHolder.string;
    }
    public void setString(String str){
        string = str;
    }
    public static Data getInstance(){
        return objectHolder;
    }

}
