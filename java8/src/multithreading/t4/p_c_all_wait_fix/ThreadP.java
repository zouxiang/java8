package multithreading.t4.p_c_all_wait_fix;

public class ThreadP extends Thread {
	private P p;
	
	public ThreadP(P p){
		super();
		this.p = p;
	}
	
	public void run() {
		while(true) {
			p.setValue();
		}
	}
}
