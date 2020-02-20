package com;

public class Threads implements Runnable {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threads t=new Threads();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		Thread t3=new Thread(t);
		t1.start();
		t2.start();
		try {
			t2.join();//t1 and t2 have started so they execute simultaneously and since t2 join it finishes and then t3 starts
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();


	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<4;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);

		}
		
	}

}
