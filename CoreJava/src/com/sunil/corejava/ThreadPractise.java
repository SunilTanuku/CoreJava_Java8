package com.sunil.corejava;

class ThreadPractise extends Thread {

    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("THread run method");

        }
    }



public static void main(String []a){
    ThreadPractise p = new ThreadPractise();
    p.start();
    for(int i=0;i<=10;i++){
        System.out.println("THread from main method");
    }
}
 }

/*class ThreadClass extends Thread{
    public void run(){
        System.out.println("RUn in second class");
    }
    public static void main(String aa[]){
        ThreadClass tc = new ThreadClass();
      //  tc.start();
        for(int i=0;i<=10;i++){
            System.out.println("mainc class in second");
        }
    }
}*/

 class ThreadInterface implements Runnable{
    public void run(){
        System.out.println("RUN METHOD INTERFACE");
    }
    public static void main(String aaa[]){
        System.out.println("main method interface ");
        ThreadInterface ti = new ThreadInterface();
        Thread tr = new Thread(ti);
        tr.start();
    }
 }