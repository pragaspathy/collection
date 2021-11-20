package com.sample;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class programe4 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number : ");
        int a = sc.nextInt();

        System.out.println("enter the second number : ");
        int b = sc.nextInt();

        System.out.println("enter the third number : ");
        int c = sc.nextInt();

        System.out.println("enter the fourth number");
        int d = sc.nextInt();

        System.out.println("average of four numbers" + (a+b+c+d) /4);

    }
}
