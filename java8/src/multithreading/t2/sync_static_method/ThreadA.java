package multithreading.t2.sync_static_method;

public class ThreadA extends Thread {
	public void run() {
		Service.printA();
	}
}
