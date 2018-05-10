package com.thenepalhub.mt8848.Utils;

/**
 * Created by Yogesh on 2018-01-11.
 */

public class StringManipulation {

    public static String expandUsername(String username){
        return username.replace(".", " ");
    }

    public static String condenseUsername(String username){
        return username.replace(" " , ".");
    }
}