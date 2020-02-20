package inheritance;

public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WageEmployee w=new WageEmployee("aswi",1,2000,"chennai",20,30);
	//System.out.println(w);
		Employee e=new Employee("as",1,2000,"chen",new Location("ddd",9));
		System.out.println(e);
		

	}

}
