package abstraction;

public class MainAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract r= new Rect();//upcasting
		r.area(2,2);
		r.display();
		
		
	}

}
