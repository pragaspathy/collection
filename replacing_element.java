package com.sample;

import java.util.ArrayList;

public class replacing_element {
    public static void main(String[] args) {

        ArrayList <String> c1 = new ArrayList<String>();
        c1.add("red");
        c1.add("blue");
        c1.add("black");

        System.out.println("before changing value" + c1);

        String c2 = "yellow";
        c1.set(2 , c2);

        int numb = c1.size();

        for (int i = 0 ; i < numb ; i++){
            System.out.println(c1.get(i));
        }

        //System.out.println("after changing value : " +  c1);
    }
}
