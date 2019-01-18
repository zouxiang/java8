package multithreading.t1;

public class Run5 {

	public static void main(String[] args) {
		try {
			MyThread2 thread = new MyThread2();
			thread.start();
			Thread.sleep(200);
			thread.interrupt();
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end.");

	}

}
