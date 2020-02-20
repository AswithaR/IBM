package com;

public class Exceptions2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		int[] b= {2,3,4};
		System.out.println("strt pgm");
		try//put code which causes exception
		{
		System.out.println(a/0);
		}
		catch(Exception e)//catch the code
		
		{
			System.out.println(e.getMessage());
		}
		System.out.println("stop");
		try
		{
			//System.out.println(b[9]);
			throw new ArrayIndexOutOfBoundsException();//throw an exception
		}
		catch(Exception e)//catch the code
		
		{
			System.out.println(e.getMessage());
		}

	}

}
