package com.mps;

import com.mps.model.Herald;

public class Main {

    private static final Herald mcLovin = new Herald("McLovin");

    public static void main(String[] args) {
        print(mcLovin.helloMessage());
        print(mcLovin.presentMascot());
    }

    private static void print(String s){
        System.out.println(s);
    }
}
