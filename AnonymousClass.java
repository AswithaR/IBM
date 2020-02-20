package innerclasses;
abstract class P
{
	abstract void show();
}

public class AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P p=new P()
				{
			void show()
			{
				System.out.println("Anonymous ");
			}
				};
p.show();
	}

}
