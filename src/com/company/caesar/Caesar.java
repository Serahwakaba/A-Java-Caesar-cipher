package com.company.caesar;

public class Caesar {

    public static String encrypt(String plainText, int shift){
        if(shift>26){
            shift = shift%26;
        }
        else (shift<0){
            shift= (shift%26)+26;
        }
    }



    public static void main(String[] args) {
    }
}
