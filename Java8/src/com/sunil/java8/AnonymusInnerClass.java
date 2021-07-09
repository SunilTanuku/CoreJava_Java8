package com.sunil.java8;//class without having any name.They can extend a class or can implement interface

/*Thread t = new Thread(); == normal
Thread t = new Thread(){
..
};

Runnable r = new Runnable(){
....
};*/

 class AnonymusInnerClass {
     public static void main(String a[]) {
         Runnable r = new Runnable() {
             @Override
             public void run() {
                 System.out.println("Im from child class");

             }
         };
         Thread t = new Thread(r);
         t.start();
     }
}
 // the above is same as lambda xpression
/*
** Anonymus inner classes are more powerful than Lambda Expression because of the below

interface A1{
     void m1();
     void m2();
}
U cannot implement lambda expression for the above

But the above can be implemented using anonymus functions as below

If the anonymus inner class implements interface  that has only 1 abstract method then only lambda xpressions can be implemented
If the anomymus inner class implements interface  that has more that 1 abstract method u need to go for Anonymus inner class
AnonmusInnerClass can
         extend a normal class
         extend a abstract class
         implement an interface that has any number of abstract methods

FunctionalInterface can implement interface  with only 1 abstract method*/

