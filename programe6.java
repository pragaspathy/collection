package com.sample;

public class programe6 {
    public static void main(String[] args) {
        int a = 15;
        int b= 20;
        System.out.println("before swapping : " + a + " " + b);

        a = a+b;
        b= a-b;
        a=a-b;
        System.out.println("after swapping : " + a + " " +  b );
    }
}
