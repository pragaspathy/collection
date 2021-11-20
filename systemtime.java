package com.sample;

import java.util.Scanner;

public class systemtime {
    public static void main(String[] args) {

        int a ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number : ");
        a = sc.nextInt();

        if (a > 0){
            System.out.println("Number is positive");
        }

        if (a <0){
            System.out.println("number is negative : ");
        }

    }
}
