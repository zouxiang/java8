package multithreading.t3.sync_update_new_value;

public class ThreadA extends Thread {
	private Service service;
	public ThreadA(Service service) {
		super();
		this.service = service;
	}
	
	public void run() {
		service.runMethod();
	}
}
