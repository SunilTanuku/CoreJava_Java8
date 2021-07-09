package com.sunil.corejava;

import java.util.*;
public class AdamNumber {
	
	static int sq=0;
	static int sq2=0;
	static int square;

	static int reverse_square(int n) {
		 int r=0;
		 int s=0;
		while(n!=0) {			
			r = n%10;
			s = s*10+r;
			n = n/10;
			}
		return s;

	}
	
	
	public static void main(String a[]) {
		Scanner c = new Scanner(System.in);
		System.out.println("Enter check number");
		int o = c.nextInt();
		square = o*o;
		
		int a1 =  reverse_square(o);
		sq2 = a1*a1;
		int a2 =  reverse_square(sq2);
		if(square == a2) {
			System.out.println("Adam NUMBER");
		}else {
		System.out.println("Not adam");
		}
	}
}
