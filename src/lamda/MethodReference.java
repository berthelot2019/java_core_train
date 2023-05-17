package lamda;

public class MethodReference {
	
	public static void saySomething() {
		System.out.println("Hello this is a static method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayable sayable=MethodReference::saySomething;
		sayable.say();

	}

}
