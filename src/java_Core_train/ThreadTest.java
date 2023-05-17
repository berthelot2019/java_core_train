package java_Core_train;

public class ThreadTest {
	
	public static void main(String[] args) {
		HelloRunner runner = new HelloRunner();
		Thread t = new Thread(runner);
		t.start();
	}

}
