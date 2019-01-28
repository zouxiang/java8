package multithreading.t6.try_lock_param;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	public ReentrantLock lock = new ReentrantLock();

	public void waitMethod() {
		try {
			if (lock.tryLock(3, TimeUnit.SECONDS)) {
				System.out.println(
						" " + Thread.currentThread().getName() + " lock aquired time is " + System.currentTimeMillis());
				Thread.sleep(10000);
			} else {
				System.out.println(" " + Thread.currentThread().getName() + " didn't aquire lock.");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			if (lock.isHeldByCurrentThread()) {
				lock.unlock();
			}
		}
	}
}
