package com;

public class WrapperClass {

	public static void main(String[] args) {
		int a=9;//primitive type
		Integer i=new Integer(9);//wrapper class
		Integer j=new Integer(8);//wrapper class
		System.out.println(i.compareTo(j));
		i=a;//assigning primitive to wrapper is autoboxing
		int b;
		b=i;//assigning wrapper to primitive is unboxing
		System.out.println("b="+b+"i="+i);
		

		// TODO Auto-generated method stub

	}

}
