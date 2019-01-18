package multithreading.t1;

public class Run7 {

	public static void main(String[] args) {
		try {
			MyThread4 thread = new MyThread4();
			thread.start();
			Thread.sleep(8000);
			thread.stop();
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}

	}

}
