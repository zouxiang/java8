package multithreading.t4.wait_interrupt_exception;

public class ThreadA extends Thread {
	private Object lock;
	public ThreadA(Object lock) {
		super();
		this.lock = lock;
	}
	
	public void run() {
		Service service = new Service();
		service.testMethod(lock);
	}
}
