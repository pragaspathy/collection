package com.sample;

import java.util.Scanner;

public class Stringreverse67809 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String value : ");
        char a[] = sc.nextLine().toCharArray();
        System.out.println("the reverse string is : ");

        for (int i = a.length - 1 ; i>=0 ; i--){
            System.out.print(a[i]);
        }

        }
        }


