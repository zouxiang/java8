package multithreading.t2.sync_static_method;

public class Service {
	public synchronized static void printA() {
		try {
			System.out.println("Thread Name=" + Thread.currentThread().getName() + " enter printA at "
					+ System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("Thread Name=" + Thread.currentThread().getName() + " leave printA at "
					+ System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized static void printB() {
		System.out.println("Thread Name=" + Thread.currentThread().getName() + " enter printB at "
				+ System.currentTimeMillis());
		System.out.println("Thread Name=" + Thread.currentThread().getName() + " leave printB at "
				+ System.currentTimeMillis());
	}
	
	public synchronized void printC() {
		System.out.println("Thread Name=" + Thread.currentThread().getName() + " enter printC at "
				+ System.currentTimeMillis());
		System.out.println("Thread Name=" + Thread.currentThread().getName() + " leave printC at "
				+ System.currentTimeMillis());
	}
}
