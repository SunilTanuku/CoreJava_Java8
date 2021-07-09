package com.sunil.corejava;//Hook Thread is same like normal thread but  executed before termination of JVM either
// normal or abnormal termination

 class MyThread03 extends Thread {
 
	 public  void run() {
		System.out.println("Hook thread");
	}	
	
	
}
   class HookThread{
	 
	  public static void main(String a[]) {
		  
		  MyThread03 t = new MyThread03();

		  Runtime r =  Runtime.getRuntime();
		  r.addShutdownHook(t);
		  for(int i=0;i<=5;i++) {
			  try {
				  Thread.sleep(1000);
			  }catch(Exception e){
				e.printStackTrace();
			  }
			  if(i==3) {
				  System.exit(0);
			  }
			  System.out.println("main thread");
		  }
		  
	  }
 }