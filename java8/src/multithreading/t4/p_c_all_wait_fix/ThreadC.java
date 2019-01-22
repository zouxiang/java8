package multithreading.t4.p_c_all_wait_fix;

public class ThreadC extends Thread {
	private C c;
	
	public ThreadC(C c) {
		super();
		this.c = c;
	}
	
	public void run() {
		while(true) {
			c.getValue();
		}
	}
}
