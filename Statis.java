package com;


public class Statis {
	String name;
	int id;
	String course;
	static String college="St.j";

	Statis() {
		this.name = "any";
		this.id = 10;
		this.course = "cse";
	}
	Statis(String name,int id,String course) {
		this.name = name;
		this.id = id;
		this.course = course;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course)
	{ 
		this.course = course; 
		}
void set(String name, int id, String course) 
 { 
	 this.name = name; 
	 this.id =id; 
	 this.course = course; 
	 
 }
 
	 public static void main(String[] args) { // TODO Auto-generated method stub
	 Statis c = new Statis();
	 System.out.println(c.getName());
	 System.out.println(c.getId());
	 System.out.println(c.getCourse());
	 System.out.println(Statis.college);
	 c.setCourse("ece");
	 System.out.println(c.getCourse());
	 Student cw = new Student("ji",8,"it");
	 System.out.println(cw.getName());

	 

	 

	 
	 
	 

}

}
