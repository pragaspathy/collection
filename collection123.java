package com.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class collection123 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("red");
        list.add("red");
        list.add("red");
        list.add("green");
        list.add("green");
        list.add("yellow");
        list.add("yellow");
        list.add("blue");

        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());

            HashMap <Integer ,String> map = new HashMap<Integer, String>();
            map.put(3,"red");
            map.put(2,"green");
            map.put(2,"red");
            map.put(1,"blue");

        }
    }
}