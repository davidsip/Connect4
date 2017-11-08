package com.example.david.assignment2;

/**
 * Created by David on 11/5/2017.
 */

public class Array {
    private static final Array objectHolder = new Array();
    private String[][] array = new String[6][7];


    public static Array getInstance(){
        return objectHolder;
    }
}
