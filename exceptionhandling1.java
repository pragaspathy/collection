package com.sample;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionhandling1 {
    public static void main(String[] args){
        //System.out.println("hellow world");

        //String myname = null;
        Scanner er = new Scanner(System.in);
        System.out.println("enter the number : ");




        String name = null;
        try
        {
            int n = er.nextInt();
            System.out.println(n);

        }

        catch (Exception sx)
        {
            System.out.println("something went wrong ");
        }

    }
}
