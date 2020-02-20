package com;

public class Thisconstructor {
	int l,w;
	Thisconstructor() {
		 System.out.println("1st");
		
	}
	Thisconstructor(int l)
	 {
		this();
		System.out.println("2nd");
		 this.l=l;
			System.out.println(l);

	 }
	Thisconstructor(int l,int w)
	{
		this(l);
		System.out.println("3rd");
		this.l=l;
		this.w=w;
		System.out.println(l);

	}
	public static void main(String[] args) {
		Thisconstructor t= new Thisconstructor(2,3);
		
		
		// TODO Auto-generated method stub

	}

}
