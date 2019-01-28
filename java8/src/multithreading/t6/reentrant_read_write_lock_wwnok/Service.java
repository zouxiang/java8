package multithreading.t6.reentrant_read_write_lock_wwnok;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {
	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	public void read() {
		try {
			try {
				lock.writeLock().lock();
				System.out.println("Aquire write lock " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
				Thread.sleep(10000);
			}finally {
				lock.writeLock().unlock();
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
