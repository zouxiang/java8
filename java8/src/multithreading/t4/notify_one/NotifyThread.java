package multithreading.t4.notify_one;

public class NotifyThread extends Thread {
	private Object lock;

	public NotifyThread(Object lock) {
		super();
		this.lock = lock;
	}
	
	public void run() {
		synchronized(lock) {
//			lock.notify();
//			lock.notify();
//			lock.notify();
//			lock.notify();
//			lock.notify();
//			lock.notify();
//			lock.notify();
			lock.notifyAll();
		}
	}

}
