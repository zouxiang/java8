package multithreading.t6.await_until_test;

public class Run {

	public static void main(String[] args) {
		Service service = new Service();
		MyThreadA myThreadA = new MyThreadA(service);
		myThreadA.start();
	}

}
