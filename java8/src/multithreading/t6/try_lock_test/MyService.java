package multithreading.t6.try_lock_test;

import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	public ReentrantLock lock = new ReentrantLock();
	
	public void waitMethod() {
		if(lock.tryLock()) {
			System.out.println(Thread.currentThread().getName() + " aquired lock.");
		}else {
			System.out.println(Thread.currentThread().getName() + " didn't aquire lock");
		}
	}
}
