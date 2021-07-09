package com.sunil.corejava;

import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		int found=0,not_found=0;
		Scanner c = new Scanner(System.in);
		System.out.println("Enter first String ");
		String first  =  c.nextLine();
		
		Scanner c2  = new Scanner(System.in);
		System.out.println("Enter second String");
		String second  =  c2.nextLine();
		
		int length_1 =  first.length();
		int length_2 =  second.length();
		
		if(length_1==length_2) {
			
			for(int i=0;i<=length_1-1;i++) {
				 found=0;
				 for(int j=0;j<=length_2-1;j++) {
					
					if(first.charAt(i)==second.charAt(j)) {
						found = 1;
						//break;
					}
				 }
					if(found == 0) {
						not_found = 1;
					//	break;
					}
		 					
			}
			 if(not_found == 1) {
				 System.out.println("Given two strings are not Anagrams");
			 }else  {
				 System.out.println("Given two strings are  Anagrams");
			 }
			
			
		}else {
			System.out.println("Two Strings are to be of same size");
		}
	}

}
 class Bb{
	void AA() {
		System.out.println("fgsd");
	}
	public static void main(String a[]) {
		Bb k = new Bb();
		k.AA();
	}
}
