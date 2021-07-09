package com.sunil.corejava;

public class ThreadDeadLock extends Thread {
    static Thread mt;
   // public void m1(){
        public void run(){
            try {
               // mt.join();    // if this line is not commented then it is deadlock 
                Thread.sleep(3000 );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for(int i=0;i<10;i++){
                System.out.println("child Thread");
            }
       // }
    }


    public static void main(String[] args) throws InterruptedException {
        mt = Thread.currentThread();
        ThreadDeadLock d = new ThreadDeadLock();

        d.start();
        d.join();
        for(int i=0;i<10;i++){
            System.out.println("main thread");
        }
    }
}
