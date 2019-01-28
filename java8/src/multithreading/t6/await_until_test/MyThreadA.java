package multithreading.t6.await_until_test;

public class MyThreadA extends Thread {
	private Service service;
	
	public MyThreadA(Service service) {
		super();
		this.service = service;
	}
	
	public void run() {
		service.waitMethod();
	}
}
