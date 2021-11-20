package com.sample;

import java.util.Scanner;

public class programe1 {
    public static void main(String[] args){
        System.out.println("hellow world");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();
        int sum = a*b;
        System.out.println(a + "x" + b + "=" + sum);
    }
}
