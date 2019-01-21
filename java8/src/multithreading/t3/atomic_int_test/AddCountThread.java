package multithreading.t3.atomic_int_test;

import java.util.concurrent.atomic.AtomicInteger;

public class AddCountThread extends Thread {
	private AtomicInteger count = new AtomicInteger(0);

	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println(count.incrementAndGet());
		}
	}
}
