package multithreading.t4.stack2_old;

public class ThreadC extends Thread {
	private C c;
	
	public ThreadC(C c) {
		super();
		this.c = c;
	}
	
	public void run() {
		while(true) {
			c.popService();
		}
	}
}
