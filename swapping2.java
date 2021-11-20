package com.sample;

import java.util.Scanner;

public class swapping2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number : ");
        int a = sc.nextInt();

        System.out.println("enter the second number : ");
        int b = sc.nextInt();

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.print("after Swapping the two number : " + "first number : " + a + " and " + " second number " + b);

    }
}
