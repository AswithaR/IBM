package com;

public class Multithreading2  implements Runnable {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multithreading2 m=new Multithreading2();//obj of main thread called runnable target
		Thread t= new Thread(m);
		t.start();
		Thread t1= new Thread(m);
		t1.start();


		

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i;
		for(i=1;i<=3;i++)
		System.out.println(i);
		
	}

}
