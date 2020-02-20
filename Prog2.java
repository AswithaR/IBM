package day1;

import java.util.Scanner;

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1;
		Scanner sc=new Scanner(System.in);
		s1=sc.nextLine();
		int tax;
		tax=sc.nextInt();
		if(s1=="general")
		{
			if(tax>=0&&tax<180001)
				System.out.println("no tax");
			else if(tax>18000&&tax<500001)
				System.out.println(0.1*tax);
			else if(tax>500000&&tax<800001)
				System.out.println(0.2*tax);
			else System.out.println(0.3*tax);
			
		}
		else
		{
			if(tax>=0&&tax<190001)
				System.out.println("no tax");
			else if(tax>19000&&tax<500001)
				System.out.println(0.1*tax);
			else if(tax>500000&&tax<800001)
				System.out.println(0.2*tax);
			else System.out.println(0.3*tax);

			
		}


	}

}
