package com.sunil.corejava;

class it1 {
	  void Sample() {
		 System.out.println("it1");
	  }

}
 class it2{
	 void Sample() {
		 System.out.println("it2");
	 }
 }

 // class Interface extends it1,it2....invalid becos of multiple inheritence
	interface M1 {
		 void s1();
		 void s2();
	} 
	/*interface M2{
		 void s1();
	}*/
	
	class B implements M1{
		public void s1() {
			System.out.println("s1 method from class B");
		}

		@Override
		public void s2() {

		}
	}
	class A implements M1{

		public void s1() {
			System.out.println("s1 method from clss a");
		}

		@Override
		public void s2() {

		}

	}
	class Interface extends A{
		
		public static void main(String a[]) {
			
			M1 k = new B();
			M1 k1 = new A();
			//Myclass c = new Myclass();
			k.s1();
			k1.s1();
		
		}
	}
	
	
	interface Interface2 {

		void A1();
		void B1();
		void C1() ;
	}
	 // to unimplement some methods in interface use abstarct keyword
	 abstract class Myclass implements Interface2{
		
		public void A1() {
			System.out.println("S");
		}
	 public void B1() {
			System.out.println("b");
		}
	 /*public void C() {
			System.out.println("c");
		}*/
	} 
	
	