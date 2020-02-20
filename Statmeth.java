package com;

public class Statmeth {

	static int a;//static vriable
	int b;//instance variable, create object in main method inorder to obtain its value
	static//static block
	{
		a=10;
		System.out.println("Static block executs before the main() since it has higher priority.");
	}
	static void setA()//static method
	{	int c=9;//local variable
	
	System.out.println(c);
		System.out.println(a);
	}
	 void setB()
	{	
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setA();
		Statmeth s= new Statmeth();
		s.setB();
		System.out.println(s.b);//same as prev line


	}

}
