package com.sample;

import java.util.Scanner;

public class exceptionhandling {
    public static void main (String[]args){

        float a, b ,c;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number : ");
        a = sc.nextInt();

        System.out.println("enter the second number: ");
        b = sc.nextInt();
        try{  
            float value = a/b;
            System.out.println("your output is: " + value);
        }
        catch (ArithmeticException ae){
            //System.out.println("your input value is wrong: ");
        }
        finally {
            System.out.println("your value is :");
        }

    }
}
