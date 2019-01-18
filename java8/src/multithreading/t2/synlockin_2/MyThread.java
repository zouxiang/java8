package multithreading.t2.synlockin_2;

public class MyThread extends Thread {
	public void run() {
		Sub sub = new Sub();
		sub.operateISubMethod();
	}
	
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
	}
}
