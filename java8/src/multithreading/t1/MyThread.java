package multithreading.t1;

public class MyThread extends Thread {
	public void run() {
		super.run();
		for (int i = 0; i < 500000; i++) {
			System.out.println("i=" + (i + 1));
		}
	}
}
