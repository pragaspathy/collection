package com.sample;

public class unique_char {
    public static void main(String[] args) {

        String word = "aeroplane";

        for (int i = 0 ; i<word.length(); i++){


            char ch = word.charAt(i);
            boolean repeat = false;
            for (int j = i + 1; j < word.length(); j++)
            {
                if (ch == word.charAt(j))
                {
                    System.out.println(ch + " : repeated : ");
                    repeat = true;
                    //break;
                }
            }

            if (repeat == false)
            {
                System.out.println(ch + ": not repeated ");
                //break;
            }

        }
















    }
}
