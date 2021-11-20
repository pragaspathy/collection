package com.sample;

import java.util.Scanner;

public class greatestnumber {
    public static void main(String[] args) {
        int a , b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("input the first number  :");
        a = sc.nextInt();

        System.out.println("input the second number :");
        b= sc.nextInt();

        System.out.println("input the third number :");
        c= sc.nextInt();

            if (a > b) if (a > c){
                System.out.println("The greatest number is " + a);
            }

            if (b > c) if (b>a){
                    System.out.println("second number is greatest:" + b);
                }
            if (c > a) if (c>b){
                System.out.println("third number is greatest :" + c);
            }
    }
}
