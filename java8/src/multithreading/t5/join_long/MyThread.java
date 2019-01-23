package multithreading.t5.join_long;

public class MyThread extends Thread {
	public void run() {
		try {
			System.out.println("begin timer=" + System.currentTimeMillis());
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
