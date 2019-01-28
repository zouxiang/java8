package multithreading.t6.lock_method_test5;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {
	private ReentrantLock lock = new ReentrantLock();
	private Condition newCondition = lock.newCondition();

	public void waitMethod() {
		try {
			lock.lock();
			newCondition.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void notifyMethod() {
		try {
			lock.lock();
			System.out.println("Is there any thread waiting for newCondition? " + lock.hasWaiters(newCondition)
					+ " , thread number is " + lock.getWaitQueueLength(newCondition));
			newCondition.signal();
			System.out.println("Is there any thread waiting for newCondition? " + lock.hasWaiters(newCondition)
			+ " , thread number is " + lock.getWaitQueueLength(newCondition));
		} finally {
			lock.unlock();
		}
	}
}
