package com.sunil.corejava;

abstract class Sample{
	
	// abstract class contain both abstract and non abstract methods
	
	public abstract void A();
	public abstract void B();
	void D() {}
	void C() {
		
		System.out.println("Implemented method");
	}
}

  class Sample2 extends Sample{
	
	 public void A() {
		 System.out.println("A");
		 
	 }
	public void B() {
		 System.out.println("B");
	 }
 }


public class AbstractClass {

	public static void main(String a[]) {
		Sample2 s  =  new Sample2();
//		Sample s = new Sample2(); // if parent reference object is created then only methods in parents are accessible
	                          // s.B() not possible
		s.A();
		s.B();
	}
	
}
