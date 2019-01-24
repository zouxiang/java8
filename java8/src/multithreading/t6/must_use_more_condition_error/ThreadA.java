package multithreading.t6.must_use_more_condition_error;

public class ThreadA extends Thread {
	private MyService service;
	
	public ThreadA(MyService service) {
		super();
		this.service = service;
	}
	
	public void run() {
		service.awaitA();
	}
}
