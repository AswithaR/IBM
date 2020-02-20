package day1;

import java.util.Scanner;

public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,dig,rem=0,flag=0,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int n1=n;
		while(n>0)
		{
			dig=n%10;
			rem=rem*10+dig;
			n/=10;
		}
		if(n1==rem)
		{
			for(i=2;i<n1;i++)
			{
				if(n1%i==0)
				{
					flag=1;
					break;
				}
			}
				if(flag==0)
				{
					System.out.println(n1+"p");
				}
			}
		}


	}


