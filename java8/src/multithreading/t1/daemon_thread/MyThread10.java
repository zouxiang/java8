package multithreading.t1.daemon_thread;

public class MyThread10 extends Thread {
	private int i = 0;
	public void run() {
		try {
			while(true) {
				i++;
				System.out.println("i="+i);
				Thread.sleep(1000);
			}
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try {
			MyThread10 thread = new MyThread10();
			thread.setDaemon(true);
			thread.start();
			Thread.sleep(5000);
			System.out.println("leave thread object, print stopped.");
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
