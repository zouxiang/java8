package multithreading.t6.fair_nofair_test;

import java.util.concurrent.locks.ReentrantLock;

public class Service {
	private ReentrantLock lock;
	public Service(boolean isFair) {
		super();
		lock = new ReentrantLock(isFair);
	}
	
	public void serviceMethod() {
		try{
			lock.lock();
			System.out.println("ThreadName=" + Thread.currentThread().getName() + " get locked.");
		}finally {
			lock.unlock();
		}
	}

}
