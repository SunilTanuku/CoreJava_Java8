package com.sunil.corejava;

public class    This {

	int age = 3;
	String name = "ss";        // instance variables
	String address="aa";
	


	void Test(int age,String name,String address) {  // local variables
		
		System.out.println("Without THIS keyword "+"AGE :"+age+ " Name :"+name+" Address :"+address);
		System.out.println("With THIS keyword "+"AGE :"+this.age+ " Name :"+this.name+" Address :"+this.address);
	}

	//this converts local variables to instance variables
	
	public static void main(String a[]) {

		This t = new This();
		t.Test(5,"Sunil","Hyderabad");
		
	}
}