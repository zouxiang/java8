package multithreading.t2.syn_not_extends;

public class ThreadB extends Thread {
	private Sub sub;

	public ThreadB(Sub sub) {
		super();
		this.sub = sub;
	}

	public void run() {
		sub.serviceMethod();
	}
}
