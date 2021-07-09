package com.sunil.corejava;

import java.util.function.Function;

class Second{
    synchronized void printEven(){
        for(int i=0;i<=100;i++){
            if(i%2 == 0){
                System.out.println("Even Threads are "+i);
            }
        }
    }
    synchronized void printOdd(){
        for(int i=0;i<=100;i++){
            if(i%2 !=0){
                System.out.println("ODD Threads are "+i);
            }
        }
    }
    public static void main(String a[]){
        Second s = new Second();
        Runnable r1=()-> {

                s.printEven();
           // }
        };
        Runnable r2 =()-> {
/*            public void run()
            {*/
                s.printOdd();
    //        }
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}

