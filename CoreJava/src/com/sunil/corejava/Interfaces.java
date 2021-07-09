package com.sunil.corejava;

interface Sample01{
	
	void A();
	void B();
	void C();
}

 abstract class Sample21 implements Sample01{

	@Override
	public void A() {
		System.out.println("A");
	}

	@Override
	public void B() {
		System.out.println("B");
	}

	/*@Override
	public void C() {
		System.out.println("C");
		
	}*/
	 
 }

/* class d extends Sample21{
	 public void C() {}
	
	 
 } */
public class Interfaces {
	public static void main(String a[]) {
/*		d s =  new d();
	    s.A();
	    s.B();
	    s.C();*/
	}

}
