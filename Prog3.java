package day1;

import java.util.Scanner;

public class Prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double a,b,c,d;
		int code=sc.nextInt();
		d=sc.nextInt();
		switch(code)
		{
		case 1:
			a=22.50;
			System.out.println(a*d);
			break;
		case 2:
			b=44.50;
			System.out.println(b*d);
			break;
		case 3:
			c=9.98;
			System.out.println(c*d);
			break;
		}
	

	

	}

}
