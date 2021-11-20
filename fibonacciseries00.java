package com.sample;

import java.util.Scanner;

public class fibonacciseries00 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n = sc.nextInt();

        int a = -1, b=1, c;
        for (int i = 1 ; i<=n ; i++){

            c = a+b; // -1+1 = 0  1 + 0 = 1  1 + 1 = 2 1+2 = 3
            System.out.println(c);

            a=b; // 1
            b=c; // 3
        }
    }
}
