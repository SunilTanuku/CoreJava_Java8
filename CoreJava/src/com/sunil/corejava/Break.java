package com.sunil.corejava;

public class Break {
	
	public static void main(String a[]) {
		for(int j=0;j<7;j++) {
		   for(int i=0;i<=5;i++) {
		        if(i==3)
				break;
			
			System.out.println(i);
		 }
		}
		// exits only its present loop.goes to next looop 
		System.out.println("Exit from break");
	}
}
