package multithreading.t5.join_sleep_2;

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
				b.join();
				for(int i=0;i<Integer.MAX_VALUE;i++) {
					String newString = new String();
					Math.random();
				}
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
