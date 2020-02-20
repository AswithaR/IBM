package day1;
import java.util.*;

public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		if(num%4==0)
		{
			if(num%100==0)
			{
				if(num%400==0)
				{
			    System.out.println("leap year");
				}
				else System.out.println("not a leap year");
			}
			else System.out.println(" leap");
		}
			else
			    System.out.println("not leap year");

				
		
		}
		

	}


