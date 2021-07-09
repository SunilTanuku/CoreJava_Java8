package com.sunil.corejava;

class MyThread08 extends Thread {

	public void run() {
		for(int i=0;i<=5;i++) {

			System.out.println("THREAD main");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println("Interrupted thread");
				e.printStackTrace();
			}

		}

	}

 }
//works only when thread is in sleep state

  class ThreadInterrupt {

	public static void main(String[] args) {
		MyThread08 t = new MyThread08();
		t.start();
		t.interrupt();
	
		}
	}

