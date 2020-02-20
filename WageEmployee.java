package inheritance;

public class WageEmployee extends Employee {
	int hr,rate;
	@Override
	public String toString() {
		return "WageEmployee [hr=" + hr + ", rate=" + rate + ", toString()=" + super.toString() + ", getName()="
				+ getName() + ", getId()=" + getId() + ", getSalary()=" + getSalary() + ", getAddress()=" + getAddress()
				 + "]";
	}

	
	public WageEmployee(String name,int id,int salary,String address,Location loc ,int hr,int rate)
	{
		super(name,id,salary,address, loc);
		this.hr=hr;
		this.rate=rate;
	}
	public int getHr() {
		return hr;
	}
	public void setHr(int hr) {
		this.hr = hr;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	


}
