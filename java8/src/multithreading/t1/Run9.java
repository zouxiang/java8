package multithreading.t1;

public class Run9 {

	public static void main(String[] args) throws InterruptedException {
		MyThread6 thread = new MyThread6();
		thread.start();
		Thread.sleep(2000);
		thread.interrupt();
	}
}
