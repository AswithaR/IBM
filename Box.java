package com;

public class Box {
	int l;
	int w;
	int h;
	static String boxCompany="hello";
	

	Box() {
		this.l = 10;
		this.w = 10;
		this.h = 10;
	}

	Box(int l, int w, int h) {
		this.l = l;
		this.w = w;
		this.h = h;
	}

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}
	static void change()
	{
		boxCompany="Hi";
		System.out.println(boxCompany);
	}
	public void calVol(int l,int w,int h)
	{ 
		int vol=l*w*h;
		System.out.println(vol);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b=new Box();
		b.change();
		b.calVol(10, 10, 10);
		System.out.println(b.getH());
		Box bb=new Box(2,3,4);
		System.out.println(bb.getH());

		

	}

}
