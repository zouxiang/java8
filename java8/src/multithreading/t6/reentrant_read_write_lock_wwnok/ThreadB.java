package multithreading.t6.reentrant_read_write_lock_wwnok;

public class ThreadB extends Thread {
private Service service;
	
	public ThreadB(Service service) {
		super();
		this.service = service;
	}
	
	public void run() {
		service.read();
	}
}
