package multithreading.t1;

public class MyThread5 extends Thread {
	public void run() {
		try {
			this.stop();
		} catch(ThreadDeath e) {
			System.out.println("enter catch.");
			e.printStackTrace();
		}
		
	}
}
