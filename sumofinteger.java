package com.sample;

import java.util.Scanner;

public class sumofinteger {
    public static void main(String[] args) {
        int num ;
        int rem;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = sc.nextInt();

        while(num > 0){

            rem = num %10;
            sum = sum + rem;
            num = num /10;

        }

        System.out.println("sum of integer is : " + sum);
    }
}
