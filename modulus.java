package com.sample;

import java.util.Scanner;

public class modulus {
    public static void main(String[] args) {

        int number1;
        int number2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        number1 = sc.nextInt();

        System.out.println("Enter the second number : ");
        number2 = sc.nextInt();

        if(number1 == number2)
            System.out.printf("%d == %d\n" , number1,number2);

        if (number1 != number2)
            System.out.printf("%d != %d\n" , number1,number2);

        if (number1 < number2)
            System.out.printf("%d < %d\n" , number1,number2);

        if (number1 > number2)
            System.out.printf("%d > %d\n" , number1,number2);

        if (number1 <= number2)
            System.out.printf("%d <= %d\n" , number1,number2);

        }
    }

