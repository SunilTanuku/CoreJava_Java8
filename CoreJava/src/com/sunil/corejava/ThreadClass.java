package com.sunil.corejava;

class MyThread extends Thread{
	
	public synchronized void run() {
		for(int i=0;i<10;i++) {
			if(i%2==0)
	    	 System.out.println("even threads are "+i);
    	  }
	}
	
	 // it is always recommended to overide run method , otherwise we get empty implmentations
    // it is not recommended to overide start method because thread is registered only when Thread class start method is executed
	/* public void start() { 
		for(int i=0;i<10;i++) {
	    	 System.out.println("userdefined thread");
    	  }
	}*/
}

 class ThreadClass {

	public static synchronized void main(String a[]) { // main thread
		MyThread r = new MyThread();
		//Thread t = new Thread(r); for interface u need to write this
		r.start();
		// 2 threads ....Thread class start method will be execiuted
		for(int i=0;i<10;i++) {
			if(i%2!=0)
			System.out.println("odd number are "+ i);
		}
	}
}

