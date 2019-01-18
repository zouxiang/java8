package multithreading.t1;

public class MyThread1 extends Thread {
	public void run() {
		super.run();
		try {
		for (int i = 0; i < 500000; i++) {
			if(this.isInterrupted()){
				System.out.println("has been in stop status, will stop now!");
				throw new InterruptedException();
			}
			System.out.println("i=" + (i + 1));
		}
		System.out.println("continue to execute!");
		} catch (InterruptedException ex) {
			System.out.println("get into catch!");
			ex.printStackTrace();
		}
	}
}
