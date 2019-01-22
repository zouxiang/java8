package multithreading.t4.wait_old;

public class ThreadSubtract extends Thread {
	private Subtract r;
	
	public ThreadSubtract(Subtract r) {
		super();
		this.r = r;
	}
	
	public void run() {
		r.subtract();
	}
}
