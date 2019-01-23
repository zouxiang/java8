package multithreading.t5.join_more_test;

public class ThreadA extends Thread {
	private ThreadB b;
	public ThreadA(ThreadB threadB) {
		super();
		this.b = threadB;
	}
	
	public void run() {
		try {
			synchronized(b) {
				System.out.println("begin A ThreadName=" + Thread.currentThread().getName() + " " +System.currentTimeMillis());
				Thread.sleep(5000);
				System.out.println("end A ThreadName=" + Thread.currentThread().getName() + " " +System.currentTimeMillis());
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
