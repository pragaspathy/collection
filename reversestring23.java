package com.sample;

import java.util.Scanner;

public class reversestring23 {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the string value : ");
//        char a [] = sc.nextLine().toCharArray();
//        System.out.println("reverse string is : ");
//        for (int i = a.length - 1 ; i>=0 ; i--){
//            System.out.print(a[i]);
//        String name = "i am the programmer";
//        String name2 = "";
//
//        int len = name.length();
//
//        for (int i = len -1 ; i >=0 ; i--){
//            name2 = name2 + name.charAt(i);
//        }
//        System.out.println("reverse string is :" + name2);
//        }
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the string value : ");
            char e [] = sc.nextLine().toCharArray();
            System.out.println("reverse string is : ");

            for (int i = e.length-1; i >=0 ; i--){
                System.out.print(e[i]);
            }

    }
}