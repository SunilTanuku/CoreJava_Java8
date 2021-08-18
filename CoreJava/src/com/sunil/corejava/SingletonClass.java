package com.sunil.corejava;

public class SingletonClass {

    private SingletonClass(){ // 2 create pirvzte constructor
        System.out.println("constructor called");
    }
    static SingletonClass obj ; // 1

   public static  SingletonClass getInstance(){
        if(obj == null){
            synchronized(SingletonClass.class) {
            if(obj == null)
                obj = new SingletonClass();
            }
        }
       return obj;
   }

    }


    class UsageClass{
        public static void main(String[] args) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    SingletonClass inst1 = SingletonClass.getInstance();

                }
            });
            Thread t2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    SingletonClass inst2 = SingletonClass.getInstance();

                }
            });
            t.start();
            t2.start();
        }

    }
// THumb rule
/*
Case 1
 1. First create a static instance of a class static SingletonClass obj =  new SingletonClass
create a private constructor
Creeate a get instance method which return the instance of the clase

Case 2 Eager initialisation
1 being static will be loaded during class loading itself so inorder to control it , returin instance in the getINstance method
If multiple objects are created then multiple instance will be created so to control this u need to check if the object is null or not in the get Instance method

Case 3 Multithreading
If there are multiple threads , then each thread is independent of each other and seperate instance wiil be created .
To control this , you need to make the getINstance method as synchronised but this increases the execution time instead add synchrionosed block .

Case 4 DOuble check .
You need to add a synchronised block and docuble check for the instance created or not
*/
