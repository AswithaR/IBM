package inheritance;

public class Location {
String name;
int no;
Location(String name,int no)
{
	this.name=name;
	this.no=no;
}
@Override
public String toString() {
	return "Location [name=" + name + ", no=" + no + "]";
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getNo() {
	return no;
}
public void setNo(int no) {
	this.no = no;
}

}
