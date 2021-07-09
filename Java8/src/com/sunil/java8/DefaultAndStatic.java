package com.sunil.java8;
// You cannot defina a method is  interface.
//But u can define method using default methods and can create object

// **************

/*If I have an interface with 2 methods and implemet it to a class then the 2 methods need to be implemented
If new method is added to the parent interface then all the child classes implementing the parent interfcace should implement the new method
To avoid this problem, the newly added method is marked as default
Without effecting implementation class if u want to add a new method go for interface
You can override default method
default method cannot be decalred in normal class but can be used only in functionalInterfaces only
You are not allowed to override object class methods*/

public interface DefaultAndStatic {
    public void m1();
    default void defaultMethod(){
        System.out.println("I am from defaultMethod");
    }
    default void defaultMethod2(int a, int b){
        System.out.println(a+b);
    }
    //default  int hashCode(){ };  // not allowed  since they are available to every class so no overridin of defailt methods
}


// Multiple Inheritence problem is solved in default methods
class DefaultTest{
    public static void main(String a[]){
        DefaultAndStatic ds = ()-> System.out.println("I am from m1 method");
        ds.m1();
        ds.defaultMethod();
        ds.defaultMethod2(10,20);
    }
}
interface Left{
     default void m1(){
        System.out.println("Left method");
    }
}

interface Right{
     default void m1(){
        System.out.println("Right method");

    }
}

class MultipleInheritance implements Left,Right{
    public void m1(){
        Left.super.m1();
        Right.super.m1();

    }
    public static void main(String a[]){
        MultipleInheritance m = new MultipleInheritance();
        m.m1();

    }
}

// From 1.8 inaterfaces support static so main method can be taken inside interface

//****************
//If every method is static and since it doesnot need ay object then no need to go for class use Interface

interface  Interf{
/*    public static void main(String a []){
        System.out.println("Main Method");

    }*/
}
