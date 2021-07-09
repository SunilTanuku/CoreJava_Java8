package com.sunil.corejava;

import java.io.IOException;

public class LatestOverriding  {

   String ParentMethod(int i) throws IOException {
        System.out.println("Parent Method");
        return "";
    }
    void ParentSecondMethod(){
        System.out.println("Parent second method");
    }
}

class OverridingClass extends LatestOverriding{

    //1. if parent method is not throwin any exception then child class cannot throw any checked exception
    // 2. If parent method doestnot throw any exception then child class can throw unchecked exeception
    // 3. If parent is throwing unchecked exception , then child should throw the same exception . or else child parent relation exception can be thrown in child class
    // if parent clsss throws exception then u need not hadnle in child class

      public String ParentMethod(String i)  {
        System.out.println("CHild overriden method");
        return "";
    }
    void ChildSecondMethod(){
        System.out.println("child second method");
    }

    public static void main(String[] args) throws Exception {


        OverridingClass obj = new OverridingClass();
        obj.ParentMethod("5");


        LatestOverriding obj2 = new LatestOverriding();
        obj2.ParentMethod(4);
        obj2.ParentSecondMethod();

        LatestOverriding obj3 = new OverridingClass();
        obj3.ParentMethod(4);
        obj3.ParentSecondMethod();




    }
}

interface MyInterface  {
    void m1();
    void m2();

}

class InterfaceExtension implements MyInterface{

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    public static void main(String[] args) {
        InterfaceExtension i = new InterfaceExtension();
        i.m1();
        i.m2();

    }
}

abstract class MyAbstractClass{
   abstract void m1();
   abstract void m2();
   void m3(){
       System.out.println("Parent Abstract Method");
   }

}

class ConcretClass extends MyAbstractClass{

    @Override
    void m1() {

    }

    @Override
    void m2() {

    }

    public static void main(String[] args) {
        ConcretClass c = new ConcretClass();
        c.m1();
        c.m2();
    }
}


class OverLoading{
    public String m1(int a){
        return "";
    }
    public int m1(String a){
        return 1;
    }

    public static void main(String[] args) {
        OverLoading l = new OverLoading();
        l.m1(1);
    }

}