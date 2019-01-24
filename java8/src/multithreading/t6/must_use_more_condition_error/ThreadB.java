package multithreading.t6.must_use_more_condition_error;

public class ThreadB extends Thread {
private MyService service;
	
	public ThreadB(MyService service) {
		super();
		this.service = service;
	}
	
	public void run() {
		service.awaitB();
	}
}
