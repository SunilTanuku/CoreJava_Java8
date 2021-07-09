package com.sunil.corejava;

import java.util.*;
public  class   FactorialRecursion {

	static int factorial(int n) {
		
		if(n==0) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
		
	}
	
	public static void main(String a[]) {
		Scanner c = new Scanner(System.in);
		System.out.println("Enteer a number");
		int a1 =  c.nextInt();
		int f=factorial(a1);
		System.out.println(f);
		
	}
	
}
