package com;
class A//parent class
{
	int a;
	public int getA() {
		return a;
	}

	public void setA(int a)
	{
		this.a = a;
	}
	void override()
	{
		System.out.println("class A");
	}

}
class B extends A//child class
{
	int b;
	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	void override()//method overriding
	{
		super.override();//if this is not used only the value of child class will be printed.
		System.out.println("class B");
	}

	
}
public class Inheritance {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b= new B();
		System.out.println(b.getA());
		System.out.println(b.a);//same as prev line
		b.setA(3);
		System.out.println(b.getA());
		b.override();

		

	}

}
