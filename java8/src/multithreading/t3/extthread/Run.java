package multithreading.t3.extthread;

public class Run {

	public static void main(String[] args) {
		try {
			RunThread thread = new RunThread();
			thread.start();
			Thread.sleep(1000);
			thread.setRunning(false);
			System.out.println("isRunning value is set to false.");
		} catch(InterruptedException e) {
			e.printStackTrace();
		}

	}

}
