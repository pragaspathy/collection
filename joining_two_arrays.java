package com.sample;

import java.util.ArrayList;

public class joining_two_arrays {
    public static void main(String[] args) {

        ArrayList <String> a1 = new ArrayList<String>();

        a1.add("a");
        a1.add("b");
        a1.add("c");
        a1.add("d");
        a1.add("e");

        ArrayList <String> a2 = new ArrayList<String>();
        a1.add("f");
        a1.add("g");
        a1.add("h");
        a1.add("i");
        a1.add("j");

        ArrayList <String> a3 = new ArrayList<String>();
        a3.addAll(a1);
        a3.addAll(a2);

        System.out.println("joining two arrays : " + a3);


    }
}
