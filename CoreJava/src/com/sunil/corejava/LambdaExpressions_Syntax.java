package com.sunil.corejava;

public class LambdaExpressions_Syntax {

    void m1(){
        System.out.println("Hello world");
    }
    // no return type no modifiers no method name just add extra symbol
    // () ->System.out.println("HelloWorld");  no return type is required. no braces since only 1 line

   void m2(int a , int b){
    System.out.println(a+b);
   }
  //  (a,b) -> System.out.println(a+b);

    public int squareInt(int n){
        return n*n;
    }
    // (int n) -> {return n*n ;}
    // (int n) -> return n*n;
    // (int n) -> n*n;
    //     n -> n*n;

    public int m1(String s){
        return s.length();
    }
    // s -> s.length();
}