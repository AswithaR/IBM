package com;


public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="malayalam";
		String rev="";
		char ch[]=s.toCharArray();
		int i;
		for(i=(s.length()-1);i>=0;i--)
		{
	         rev = rev + s.charAt(i);
		}

		if(s.equals(rev))
		{
			System.out.println("palindrome");
		}
		else System.out.println("not");
	}
}