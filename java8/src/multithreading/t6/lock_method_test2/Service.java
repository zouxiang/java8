package multithreading.t6.lock_method_test2;

import java.util.concurrent.locks.ReentrantLock;

public class Service {
	public ReentrantLock lock = new ReentrantLock();

	public void serviceMethod() {
		try {
			lock.lock();
			System.out.println("ThreadName=" + Thread.currentThread().getName() + " enter method");
			Thread.sleep(Integer.MAX_VALUE);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
}
