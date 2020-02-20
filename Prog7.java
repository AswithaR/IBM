package day1;
import java.lang.Math;
public class Prog7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,flag=0;
		System.out.println(Math.cbrt(2));
		for(j=3;j<=100;j=j+2)
		{
		for(i=2;i<j&&j%i!=0;i++);
			if(j==i)
			{
				System.out.println(Math.cbrt(j));
			}
				
			
		}
	}
}


	


