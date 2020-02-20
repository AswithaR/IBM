package com;

public class Count {
	int i;
	synchronized void count()
	{
		i++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count c=new Count();
		Thread t1=new Thread() {
			public void run()
			{
				for(int j=1;j<=100;j++)
				{
					c.count();
				
				}
				System.out.println(c.i);

			}
		};
		Thread t=new Thread() {
			public void run()
			{
				for(int j=1;j<=100;j++)
				{
					c.count();
				
				}
				System.out.println(c.i);

			}
		};

		t1.start();
		t.start();

		
		

	}

}
