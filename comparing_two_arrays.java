package com.sample;

import java.util.ArrayList;

public class comparing_two_arrays {
    public static void main(String[] args) {

        ArrayList <String> new1 = new ArrayList<String>();
        new1.add("one");
        new1.add("two");
        new1.add("three");
        new1.add("four");
        new1.add("five");

        //System.out.println(new1);

        ArrayList <String> new2 = new ArrayList<String>();
        new2.add("one");
        new2.add("six");
        new2.add("seven");
        new2.add("four");
        new2.add("five");

        //System.out.println(new2);

        ArrayList <String> new3 = new ArrayList<String>();

        for (String new4: new1 )

        new3.add(new2.contains(new4) ? "yes" : "NO");
        System.out.println(new3);

    }
}