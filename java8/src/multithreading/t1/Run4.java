package multithreading.t1;

public class Run4 {

	public static void main(String[] args) {
		try {
			MyThread1 thread = new MyThread1();
			thread.start();
			Thread.sleep(2000);
			thread.interrupt();
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end.");
		

	}

}
