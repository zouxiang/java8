package multithreading.t5.join_sleep_2;

public class ThreadC extends Thread {
	private ThreadB threadB;
	
	public ThreadC(ThreadB threadB) {
		super();
		this.threadB = threadB;
	}
	
	public void run() {
		threadB.bService();
	}
}
