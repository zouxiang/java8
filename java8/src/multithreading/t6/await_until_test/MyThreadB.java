package multithreading.t6.await_until_test;

public class MyThreadB extends Thread {
	private Service service;

	public MyThreadB(Service service) {
		super();
		this.service = service;
	}

	public void run() {
		service.notifyMethod();
	}
}
