package com.sunil.corejava;

public class Patterns {

	void pattern1() {
		for(int i=1;i<=5;i++) {

			for(int j=1;j<=i;j++) {

				System.out.print(j);
			}
			System.out.println();
			
		}

		for(int i= 5;i>=1;i--) {
			
			for(int j=1;j<i;j++) {
				
				System.out.print(j);
			}
			System.out.println();
			
		}
	}

	void alphabet() {
		char ch='A';
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(ch);
			}
			System.out.println();
			ch++;
		}

	}
	public static void main(String a[]) {
		Patterns p = new Patterns();
		p.pattern1();
		p.alphabet();
	} 
}
