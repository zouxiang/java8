package multithreading.t4.notify_one;

public class ThreadC extends Thread {
	private Object lock;

	public ThreadC(Object lock) {
		super();
		this.lock = lock;
	}

	public void run() {
		Service service = new Service();
		service.testMethod(lock);
	}
}
