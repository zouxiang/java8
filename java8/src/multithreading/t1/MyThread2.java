package multithreading.t1;

public class MyThread2 extends Thread {
	public void run() {
		super.run();
		try {
			System.out.println("run begin");
			Thread.sleep(200000);
			System.out.println("run end");
		} catch (InterruptedException ex) {
			System.out.println("stop in sleep, get into catch!"+this.isInterrupted());
			ex.printStackTrace();
		}
	}
}
