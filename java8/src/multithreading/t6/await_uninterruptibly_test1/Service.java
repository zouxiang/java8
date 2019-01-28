package multithreading.t6.await_uninterruptibly_test1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {
	private ReentrantLock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	
	public void testMethod() {
		try {
			lock.lock();
			System.out.println("wait begin");
//			condition.await();
			condition.awaitUninterruptibly();
			System.out.println("wait end");
		}
//		catch(InterruptedException e) {
//			e.printStackTrace();
//		}
		finally {
			lock.unlock();
		}
	}
}
