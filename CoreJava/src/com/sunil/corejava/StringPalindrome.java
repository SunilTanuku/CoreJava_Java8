package com.sunil.corejava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringPalindrome {
    public void stringPalindrome() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first name");
        String string1 = br.readLine();
        System.out.println("Enter second name");
        String string2 = "";
      //  char[] ch1 = string1.toCharArray();
        for(int i=string1.length()-1;i>=0;i--){
            string2 = string2+string1.charAt(i);

        }
        if(string2.equals(string1)){
            System.out.println("YES !! G iven names are palindrome");
        }
        else{
            System.out.println("NO !!! Given two names are not palindrome");
        }

    }

    public static void main(String a[]) throws IOException {
        StringPalindrome pr = new StringPalindrome();
        pr.stringPalindrome();
    }
}
