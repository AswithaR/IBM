package com;

public class Strings {

	public static void main(String[] args) {
		String s="hello";//literal
		String s1=new String("hello");//creation using new
		String s2=new String("hello");//creation using new
		//Immutable
		System.out.println(s1.concat(s));
		System.out.println(s1);
		
		
		System.out.println(s.substring(3));//prints from tht index
		System.out.println(s.substring(0, 2));//strt and end index
		System.out.println(s.equals(s1));
		System.out.println(s==s2);//checks the reference and not the string
		
		//Mutable
		StringBuffer sb=new StringBuffer("abdc");
		sb.reverse();
		System.out.println(sb);
		
		StringBuilder sb1=new StringBuilder("hell");
		sb1.reverse();
		System.out.println(sb1);

		


	}

}
