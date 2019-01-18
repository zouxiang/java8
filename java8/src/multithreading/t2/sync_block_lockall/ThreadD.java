package multithreading.t2.sync_block_lockall;

public class ThreadD extends Thread {
	private MyObject object;
	
	public ThreadD(MyObject object) {
		super();
		this.object = object;
	}
	
	public void run() {
		super.run();
		object.speedPrintString();
	}
}
