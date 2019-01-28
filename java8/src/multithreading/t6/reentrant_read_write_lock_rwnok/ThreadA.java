package multithreading.t6.reentrant_read_write_lock_rwnok;

public class ThreadA extends Thread {
	private Service service;
	
	public ThreadA(Service service) {
		super();
		this.service = service;
	}
	
	public void run() {
		service.read();
	}
}
