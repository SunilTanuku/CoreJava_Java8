package com.sunil.corejava;

class MyThread01 extends Thread {

	public void run() {
		for(int i=0;i<=5;i++) {

			System.out.println("THREAD JOIN");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}

public class ThreadJoin {
	public static void main(String a[]) {
		MyThread01 t1 = new MyThread01();
		MyThread01 t2 = new MyThread01();

		t1.start();
		try {
			t1.join(2000); //can pass arguments to it
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		
			for(int i=0;i<5;i++) {
			System.out.println("Main Thread");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}