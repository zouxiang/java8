package multithreading.t2.sync_block_lockall;

public class ThreadE extends Thread {
private MyObject object;
	
	public ThreadE(MyObject object) {
		super();
		this.object = object;
	}
	
	public void run() {
		super.run();
		object.speedPrintString_1();
	}
}
