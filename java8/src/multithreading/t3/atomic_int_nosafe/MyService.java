package multithreading.t3.atomic_int_nosafe;

import java.util.concurrent.atomic.AtomicLong;

public class MyService {
	public static AtomicLong aiRef = new AtomicLong();
//	synchronized public void addNum() {
		public void addNum() {
		System.out.println(Thread.currentThread().getName() + " Value after adding 100 is: " + aiRef.addAndGet(100));
		aiRef.addAndGet(1);
	}
}
