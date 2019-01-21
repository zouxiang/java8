package multithreading.t3.volatile_test;

public class Mythread extends Thread {
	volatile public static int count;
	private synchronized static void addCount() {
//		private static void addCount() {
		for(int i=0; i<100; i++) {
			count++;
		}
		System.out.println("count=" + count);
	}
	
	public void run() {
		addCount();
	}
}
