package com.sunil.corejava;

import java.util.*;
public class Palindrome {
	static int r,s=0;
	public static void main(String a[]) {
	Scanner c = new Scanner(System.in);
	System.out.println("enter number");
	int n = c.nextInt();
			while(n!=0) {
	          r = n%10;
	          s=s*10+r;
	          n=n/10;
				
			}
			System.out.println(s);
	}
}
