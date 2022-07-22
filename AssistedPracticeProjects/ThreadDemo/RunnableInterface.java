package ThreadDemo;

import ThreadDemo.RunnableInterface;

public class RunnableInterface implements Runnable {
	
	//implement run method
	
	public  void run() {
		
		for(int i=1; i<5; i++) {
			
			System.out.println(i+ " "+Thread.currentThread().getName());
		
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//1000milliseconds=1second
			
		}
		
		
		 
	}
	
	
	public static void main(String[] args) {
		//create target of runnable interface
		
		RunnableInterface ins1= new RunnableInterface();
		RunnableInterface ins2= new RunnableInterface();
		
		//create threads  by passing runnable targets in constructor
		Thread t1=new  Thread(ins1);
		Thread t2=new  Thread(ins2);
		
		t1.setName("First");
		t2.setName("Second");
	
		t1.start();
		t2.start();
	}

}