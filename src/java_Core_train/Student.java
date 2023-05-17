package java_Core_train;

public class Student {
	int roln;
	String name;
	static String college="MGT";
	
	static void change() {
		college="MGIT";
	}
	
	Student(int r, String n){
		roln = r;
		name = n;
	}
	
	public void display() {
		System.out.println(roln+" "+name+" "+college);
	}
}
