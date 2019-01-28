package multithreading.t6.lock_method_test6;

import java.util.concurrent.locks.ReentrantLock;

public class Service {
	private ReentrantLock lock;
	public Service(boolean isFair) {
		super();
		lock = new ReentrantLock(isFair);
	}
	
	public void serviceMethod() {
		try {
			System.out.println(lock.isHeldByCurrentThread());
			System.out.println(lock.isLocked());
			lock.lock();
			System.out.println(lock.isHeldByCurrentThread());
			System.out.println(lock.isLocked());
			System.out.println("Is lock fair? " + lock.isFair());
		}finally {
			lock.unlock();
		}
	}
}
