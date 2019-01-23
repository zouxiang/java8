package multithreading.t5.join_sleep_1;

public class ThreadA extends Thread {
	private ThreadB b;
	public ThreadA(ThreadB threadB) {
		super();
		this.b = threadB;
	}
	
	public void run() {
		try {
			synchronized(b) {
				b.start();
				Thread.sleep(6000);//won't release lock
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
