package com.sunil.corejava;

public class OverRiding {
     void m1(){ System.out.println("I m from m1"); }

    static void m2(){System.out.println("Im from m2");}
}


// while creating object if u make parent reference to object
//by default overriden method value is the output
//But if the method is static then the value is parent value

class Hiding extends OverRiding{
      void m1() { System.out.println("Im from hiding methiod"); }

  static void m2(){System.out.println("Im from hiding m2"); }

 public static void main(String a[]){
     OverRiding h = new OverRiding();
     h.m1();
     h.m2();
     Hiding h2 = new Hiding();
     h2.m1();
     h2.m2();
     OverRiding h3 = new OverRiding();
     h3.m1();
     h3.m2();
 }
}


class MyClass{
    void firstMethod(){
        System.out.println("parent first method");

    }
    void SecondMethod(){
        System.out.println("parent second method");
    }
}
class SubClass extends MyClass{
    void ThirdMethod(){
        System.out.println("Third method");
    }

    public static void main(String[] args) {
        SubClass c = new SubClass();
        c.ThirdMethod();
 /*       c.SecondMethod();
        c.firstMethod();*/
    }
}