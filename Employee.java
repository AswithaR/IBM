package inheritance;

public class Employee {
	String name;
	int id;
	int salary;
	String address;
	Location loc;

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", address=" + address + ", loc=" + loc
				+ "]";
	}

	Employee(String name, int id, int salary, String address,Location loc) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.address = address;
		this.loc=loc;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
