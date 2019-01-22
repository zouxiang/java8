package multithreading.t4.stack_4;

public class ThreadP extends Thread {
	private P p;
	
	public ThreadP(P p){
		super();
		this.p = p;
	}
	
	public void run() {
		while(true) {
			p.pushService();
		}
	}
}
