package multithreading.t6.lock_method_test3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {
	private ReentrantLock lock = new ReentrantLock();
	private Condition newCondition = lock.newCondition();
	
	public void waitMethod() {
		try{
			lock.lock();
			newCondition.await();
			System.out.println("Wake thread:" + Thread.currentThread().getName());
		}catch(InterruptedException e) {
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	
	public void notifyMethod() {
		try {
			lock.lock();
			System.out.println("There are " + lock.getWaitQueueLength(newCondition) + " threads are waiting for newCondition");
			newCondition.signal();
			System.out.println("There are " + lock.getWaitQueueLength(newCondition) + " threads are waiting for newCondition");
		}finally{
			lock.unlock();
		}
	}
}
