package com.sunil.corejava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class StringReverse {

	public static void main(String a[]) throws IOException {
		Scanner s = new Scanner(System.in);
        System.out.println("Enter a name for scanner ");
        String name =  s.nextLine();
        String reverse = "";
        for(int i= name.length()-1;i>=0;i--) {
        	reverse =  reverse+name.charAt(i);
        	
        }
        System.out.println("Reverse using Scanner is  = "+reverse);
	//}
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a name ");
        String brname = br.readLine();
        System.out.println("Entered name is "+brname);
        String reverseName  = "";
        for(int i = brname.length()-1;i>=0;i--){
            reverseName = reverseName+name.charAt(i);
        }
        System.out.println("Reverse of given name is "+reverseName);
    }
	
	
}
