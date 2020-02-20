package com;

public class Overloding {
	//can change the no of arguments and the return type. t0 chieve compile time polymoh
	int add(int a, int b)
	{
	return a+b;	
	}
	int add(int a, int b,int c)
	{
		return a+b+c;
	}
	double add(int a, double b)
	{
		return a+b;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloding o=new Overloding();
		System.out.println(o.add(2, 2));
		System.out.println(o.add(2, 3,4));
		System.out.println(o.add(2, 5.5));

	}

}
