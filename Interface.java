package interfaces;
interface Fly
{
	void fly();
}
interface Run extends Fly//interface can extend interface
{
	void run();
}
interface Swim extends Run
{
 double speed=34.5;//alwayz an interface variable is final 
	void swim();//by default it is abstract
	
}

class Automobile
{
	
}
class Bus extends Automobile implements Fly
{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("fly");
		
	}
	
}
class Water extends Automobile implements Swim//initially an error occured because it must imlement run interface also
{

	@Override
	public void swim() {
		System.out.println("100km/hr");
		// TODO Auto-generated method stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("fly");
	}
	
}

public class Interface {

	public static void main(String[] args) {
		Water i=new Water();
		i.swim();
		i.run();
		System.out.println(Swim.speed);
		Bus b=new Bus();
		b.fly();
		
		// TODO Auto-generated method stub

	}

}
