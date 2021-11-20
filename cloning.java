package com.sample;

import java.util.ArrayList;

public class cloning {
    public static void main(String[] args) {

        ArrayList <String> c1 = new ArrayList<String>();
        c1.add("a");
        c1.add("b");
        c1.add("c");
        c1.add("d");
        c1.add("e");
        c1.add("f");

        System.out.println("before cloning" + c1);

        ArrayList<String> newc1 = (ArrayList<String>)c1.clone();
        System.out.println("after cloning" + newc1);

        int sum = newc1.size();

        for (int i = 0 ; i < sum ; i++){
            System.out.println("after cloning" + newc1.get(i));
        }


        }
    }

