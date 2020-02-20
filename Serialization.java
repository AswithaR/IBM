package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization implements Serializable{
	 transient int id;//to prevent it from serializing
	String name;
	 Serialization(int id,String name) {
		 this.id=id;
		 this.name=name;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Serialization s=new Serialization(2,"aswi");
		FileOutputStream fout=new FileOutputStream("D:\\test.out");
		ObjectOutputStream out=new ObjectOutputStream(fout);//since obj is created
		//Serialiaztion to write it
		out.writeObject(s);
		out.flush();
		out.close();
		fout.close();
		//Deserialization to read it
		FileInputStream fin=new FileInputStream("D:\\test.out");
		ObjectInputStream oin=new ObjectInputStream(fin);
		Serialization ss=(Serialization)oin.readObject();
		System.out.println(ss.id);
		System.out.println(ss.name);
		oin.close();
		//fin.close();
		
	}

}
