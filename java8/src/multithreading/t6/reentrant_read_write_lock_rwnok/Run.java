package multithreading.t6.reentrant_read_write_lock_rwnok;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		Service service = new Service();
		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();
		Thread.sleep(1000);
		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();
		Thread.sleep(1000);
		b = new ThreadB(service);
		b.setName("C");
		b.start();
		Thread.sleep(1000);
		a = new ThreadA(service);
		a.setName("D");
		a.start();
	}

}
