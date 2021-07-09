package com.sunil.corejava;

import java.util.Scanner;

public class Powerofnumber {

	void number() {
		Scanner c = new Scanner(System.in);
		System.out.println("Enter base number :");
		int m =  c.nextInt();
		Scanner c2 = new Scanner(System.in);
		System.out.println("Enter power number :");
		int n = c2.nextInt();
		int z=1;
		for(int i=1;i<=n;i++) {
			z=z*m;
		}
		System.out.println(m+" power "+n+" is "+z);
	}
	
	public static void main(String a[]) {
		Powerofnumber p = new Powerofnumber();
		p.number();
	}
}
