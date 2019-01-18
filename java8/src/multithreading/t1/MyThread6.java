package multithreading.t1;

public class MyThread6 extends Thread {
	public void run() {
		while(true) {
			if(this.isInterrupted()) {
				System.out.println("stopped!");
				return;
			}
			System.out.println("timer=" + System.currentTimeMillis());
		}
	}
}
