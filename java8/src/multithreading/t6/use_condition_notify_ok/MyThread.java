package multithreading.t6.use_condition_notify_ok;

public class MyThread extends Thread {
	private MyService service;
	
	public MyThread(MyService service) {
		super();
		this.service = service;
	}
	
	public void run() {
		service.await();
	}
}
