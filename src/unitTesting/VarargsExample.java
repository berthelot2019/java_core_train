package unitTesting;

public class VarargsExample {
	
	public static void display(String...values) {
		System.out.println("Sample varargs method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display();
		display("I"," am"," varargs"," method");

	}

}
