package multithreading.t2.sync_block_lockall;

public class ThreadA extends Thread {
	private Service service;
	private MyObject object;
	
	public ThreadA(Service service, MyObject object) {
		super();
		this.service = service;
		this.object = object;
	}
	
	public void run() {
		super.run();
		service.testMethod1(object);
	}

}
