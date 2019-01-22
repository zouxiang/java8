package multithreading.t3.sync_update_new_value;

public class ThreadB extends Thread {
	private Service service;
	public ThreadB(Service service) {
		super();
		this.service = service;
	}
	
	public void run() {
		service.stopMethod();
	}
}
