package com;

public class Multithreading1 extends Thread// since thread class is extended no need to create obj for main thread
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		  for(int i=1;i<=5;i++){  
			   try{  
			    Thread.sleep(500);  
			   }catch(Exception e){System.out.println(e);}  
			  System.out.println(i);  
		  }
			  }  

	

	public static void main(String[] args) {
		Multithreading1 t1=new Multithreading1();
		Multithreading1 t2=new Multithreading1();
		Multithreading1 t3=new Multithreading1();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		t3.start();
		// TODO Auto-generated method stub

	}

}
