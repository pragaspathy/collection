package com.sample;

import java.util.Scanner;

public class programe2 {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();
        System.out.println("addition of two number is : " + (a+b));
        System.out.println("subtraction of two number is : " + (a-b));
        System.out.println("multiplication of two number is : " + (a*b));
        System.out.println("division of two number is : " + (a/b));
        System.out.println("percentage two number is : " + (a%b));
    }
}
