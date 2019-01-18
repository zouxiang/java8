package multithreading.t2.doublesync_blockonetwo;

public class ThreadA extends Thread {
	private ObjectService service;
	
	public ThreadA(ObjectService service) {
		super();
		this.service = service;
	}
	
	public void run() {
		super.run();
		service.serviceMethodA();
	}
}
