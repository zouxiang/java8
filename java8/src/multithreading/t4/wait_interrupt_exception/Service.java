package multithreading.t4.wait_interrupt_exception;

public class Service {
	public void testMethod(Object lock) {
		try {
			synchronized(lock) {
				System.out.println("begin wait()");
				lock.wait();
				System.out.println("end wait()");
			}
		} catch(InterruptedException e) {
			e.printStackTrace();
			System.out.println("Exception occurred, because waiting thread was interrupted.");
		}
	}
}
