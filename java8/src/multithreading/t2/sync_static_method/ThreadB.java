package multithreading.t2.sync_static_method;

public class ThreadB extends Thread {
	public void run() {
		Service.printB();
	}
}
