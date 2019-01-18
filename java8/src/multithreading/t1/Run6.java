package multithreading.t1;

public class Run6 {
	public static void main(String[] args) {
		MyThread3 thread = new MyThread3();
		thread.start();
		thread.interrupt();
		System.out.println("end.");
	}
}
