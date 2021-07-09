package com.sunil.corejava;

public class CovariantReturnType{
	public static void main(String a[]) {
		
	}
}
 class   Animal {
	
}
 class Dog extends Animal{
	
}

 class Parent{
	
	Animal Marry() {
		System.out.println("Parent class");
		Animal k = new Animal();
		return k;
	}
}

  class Child extends Parent{
	 
	 Dog Marry() {
		 System.out.println("Child class");
		 Dog g = new Dog();
		 return g;
	 }
	 public static void main(String a[]) {
		 Child l =  new Child();
		 l.Marry();
	 }
 }