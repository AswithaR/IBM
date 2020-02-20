
package abstraction;

public abstract class Abstract {
	abstract double area(int l,int b);
	void display()
	{
		System.out.println("display");
	}
}
class Rect extends Abstract
{
	int l,b;
	public int getL() {
		return l;
	}
	public void setL(int l) {
		this.l = l;
	}
	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}	

	@Override
	double area( int l,int b) {
		
		System.out.println(l*b);
		
		// TODO Auto-generated method stub
		return 0;
	}
	
}

