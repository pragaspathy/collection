package com.sample;

public class repeatstring {
    public static void main(String[] args) {

        String name = "indo";
        char ch = name.charAt(0);
        boolean repeat = false;

        for (int i = 1 ; i < name.length() ; i++){

            if(ch == name.charAt(i))
            {
                System.out.println(ch + " : repeated value is ");
                repeat = true;
                break;
            }
            if (repeat ==false){

                System.out.println(ch + ": not repeated ");
                break;
            }

        }








    }
}
