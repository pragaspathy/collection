package com.sample;

import java.util.ArrayList;
import java.util.Collections;

public class swapping_two_elements {
    public static void main(String[] args) {

        ArrayList <String> new2 = new ArrayList <String>();
        new2.add("a");
        new2.add("b");
        new2.add("c");
        new2.add("d");
        new2.add("e");

        System.out.println("before swapping : ");
        for (String a : new2){
            System.out.println(a);
        }
        System.out.println("after swapping: ");
        Collections.swap(new2 , 0 , 4);
        //System.out.println(new2);

        for (String b : new2){
            System.out.println(b);
        }

    }
}