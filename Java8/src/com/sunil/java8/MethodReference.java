package com.sunil.java8;

public interface MethodReference {
      void display();
}
class  ImplementedClass implements MethodReference{
    public void display(){
        System.out.println("DisplayClass ");
    }
    static void implementedMethod(){
        System.out.println("I am from Implemented Class");
    }
/*}
 // Syntax is ClassName :: MethodName
// Create instance to a class and refer that method to class name of parent
class MethodReferenceTest{*/
    public static void main(String a[]){
/*       ImplementedClass imp = new ImplementedClass();
       imp.display();
       ImplementedClass.implementedMethod();*/
        MethodReference mr = ImplementedClass::implementedMethod;
        mr.display();
    }


 }

class MethodReferenceThread{
    public static void m1(){
        System.out.println("Child Thread");
    }
    public void m2(){
        System.out.println("NOn static child thread");
    }
}

class MyThread extends MethodReferenceThread{
    public static void main(String a[]){
/*        Runnable r = ()->{
            for(int i=0;i<=10;i++){
                System.out.println("child Thread");
            }
        }; This can be replaced with already having m1 method using MEthodReference */
        Runnable r = MethodReferenceThread::m1;
        MethodReferenceThread tr = new MethodReferenceThread();
        Runnable r2 = tr::m2;
        Thread t2 = new Thread(r2);
        Thread t = new Thread(r);
         t.start()  ;
        t2.start();
        for(int i=0;i<=10;i++){
            System.out.println("Main Thread");
        }
    }

}

