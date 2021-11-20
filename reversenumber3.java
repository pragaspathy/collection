package com.sample;

import java.util.Scanner;

public class reversenumber3 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number : ");
        int s = sc.nextInt();

        int reverse = 0 , rem;

        while (s!=0) //123
        {
            rem = s % 10;
            reverse = (reverse * 10) + rem;
            s = s /10;
        }
        System.out.println("the reverse number is : " + reverse);

    }
}
