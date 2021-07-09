package com.sunil.corejava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlphabetOrNot {
    public boolean oracle() throws IOException {

     //   public static void main (String[]args){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter data");
            String s = br.readLine();
            char[] c = s.toCharArray();

            for (int i = 0; i <= c.length; i++) {

                    if(Character.isAlphabetic(c[i]))
                  return true;
                else
                    return false;
            }
        return false;
    }
        public static void main(String app[]) throws IOException {
                AlphabetOrNot t = new AlphabetOrNot();
             boolean value =  t.oracle();
                System.out.println("value is "+ value);
        }

    }

