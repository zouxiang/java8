package multithreading.t4.wait_old;

public class ThreadAdd extends Thread {
	private Add p;
	
	public ThreadAdd(Add p) {
		super();
		this.p = p;
	}
	
	public void run() {
		p.add();
	}
}
