package multithreading.t2.syn_not_extends;

public class ThreadA extends Thread {
	private Sub sub;
	
	public ThreadA(Sub sub){
		super();
		this.sub = sub;
	}
	
	public void run() {
		sub.serviceMethod();
	}
}
