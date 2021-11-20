package com.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List <String> arraylist = new ArrayList <String> ();
        arraylist.add("red");
        arraylist.add("blue");
        arraylist.add("yellow");
        arraylist.add("voilet");
        arraylist.add("green");
        arraylist.add("pink");

        System.out.println(arraylist);

        arraylist.add(0 , "pink");
        arraylist.add(3, "yellow");

        System.out.println(arraylist);
        String element = arraylist.get(1);
        System.out.println("first element : " +  element);
        String element1 = arraylist.get(2);
        System.out.println("second element : " + element1);
        System.out.println(arraylist);

        arraylist.set(0 , "black");
        System.out.println("setting element: " + arraylist);

        arraylist.remove(2);
        System.out.println("removing the element : " + arraylist);

        if (arraylist.contains("orange")){
            System.out.println("found the (red) in  element  : ");
        }
        else {
            System.out.println("there is no such element : ");
        }

        Collections.sort(arraylist);
        System.out.println("after sorting : " + arraylist);

        List <String > arraylist2 = new ArrayList<String>();
        arraylist2.add("1");
        arraylist2.add("2");
        arraylist2.add("3");
        arraylist2.add("4");
        arraylist2.add("5");
        arraylist2.add("6");

        System.out.println("before copy : " + arraylist2);

        Collections.copy(arraylist , arraylist2);
        System.out.println("after coppying arraylist1 : " + arraylist);
        System.out.println("after copying arraylist2 : " + arraylist2 );















    }
}
