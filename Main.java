package com.sample;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value : ");
        float a = sc.nextInt();
        System.out.println("Enter the second value : ");
        float b = sc.nextInt();
        float divide = a / b;
        System.out.println("value of a divide :" + divide);
    }
}
