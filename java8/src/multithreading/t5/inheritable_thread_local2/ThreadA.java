package multithreading.t5.inheritable_thread_local2;

public class ThreadA extends Thread {
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				System.out.println("get value from ThreadA = " + Tools.t1.get());
				Thread.sleep(100);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
