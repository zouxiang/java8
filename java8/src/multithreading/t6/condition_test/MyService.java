package multithreading.t6.condition_test;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	private Lock lock = new ReentrantLock();
	public Condition condition = lock.newCondition();
	private boolean hasValue = false;
	
	public void set() {
		try {
			lock.lock();
			while(hasValue) {
				condition.await();
			}
			System.out.println("print @");
			hasValue = true;
			condition.signal();
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	
	public void get() {
		try {
			lock.lock();
			while(!hasValue) {
				condition.await();
			}
			System.out.println("print #");
			hasValue = false;
			condition.signal();
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
}
