package innerclasses;

public class MemeberInnerClassExample {
	int a=10;
	class SecondClass
	{
		void msg()
		{
			System.out.println(a);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemeberInnerClassExample i=new MemeberInnerClassExample();
		MemeberInnerClassExample.SecondClass s=i.new SecondClass();//access inner class using outer class objec
		s.msg();
	}

}
