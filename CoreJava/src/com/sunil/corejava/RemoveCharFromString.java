package com.sunil.corejava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveCharFromString {
    public void removeChar() throws IOException {

        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter a string");
        StringBuilder brd = new StringBuilder();
        String input = br.readLine();
        String str = "";
        char[] ch = input.toCharArray();
        for(int i = 0;i<=ch.length-1;i++){
         if(ch[i] =='u'){
             ch[i] =' ';
             if(!Character.isWhitespace(ch[i]))
             str =str+ch[i];
         }else{
             str =str+ch[i];
         }
            }


        System.out.println("Filtered output is "+ str);

    }

    public static void main(String a[]) throws IOException {
        RemoveCharFromString rc = new RemoveCharFromString();
        rc.removeChar();
    }
}
