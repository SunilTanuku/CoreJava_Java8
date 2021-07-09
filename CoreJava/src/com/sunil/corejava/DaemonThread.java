package com.sunil.corejava;

class SampleThread extends Thread{

	public void run() {
		for(int i=0;i<=10;i++) {

			System.out.println("Daemon THREAD");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}

		}

	}
}

//Daemon tthread is the background thread .Dependent on foreground thread

public class DaemonThread {

	public static void main(String a[]) {
		SampleThread t = new SampleThread();
		t.setDaemon(true);
		t.start();
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
