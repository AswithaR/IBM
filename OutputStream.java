package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//writing
		FileOutputStream out=new FileOutputStream("D:\\test.txt");
		String s="Welco12e";//to print integer enter it in string
		byte b[]=s.getBytes();
		out.write(b);
		out.write(65);//prints ascii since in file it gets stored as text.
		System.out.println("yes");
		out.close();
		
		//reading
		FileInputStream fin=new FileInputStream("D:\\test.txt");
		int i= 0;//to store what we read.
        while((i=fin.read())!=-1){    
		System.out.print((char)i);
        }
		fin.close();

		
		

	}

}
