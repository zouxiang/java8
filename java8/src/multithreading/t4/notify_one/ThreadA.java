package multithreading.t4.notify_one;

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
