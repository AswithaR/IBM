package com;

public class Occurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="asswi";
		char[] ch=s.toCharArray();
		int i,j,num=0;
		char c=' ';
		int len=s.length();
		for(i=0;i<len;i++)
		{
			if(c!=s.charAt(i))
			{
				c=s.charAt(i);
				num=1;
			}
			for(j=i+1;j<len;j++)
			{
				if(s.charAt(j)==c)
				{
					num++;
				}
			}
			System.out.println(c+"="+num);
		

	}

}
}