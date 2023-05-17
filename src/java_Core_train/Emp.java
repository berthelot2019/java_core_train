package java_Core_train;

public class Emp extends Person {
	public float salary;
	Emp(String name,float salary){
		super(name);
		this.salary=salary;
	}
	
	public void display() {
		System.out.println(name+" : "+salary);
	}
}
