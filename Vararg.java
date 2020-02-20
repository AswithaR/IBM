package com;

public class Vararg {
	static void add(int... val)
	{
		int sum=0;
		for(int i:val)
		{
			sum+=i;
		}
		System.out.println(sum);
	
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		add();
		add(2,3);
		

	}

}
