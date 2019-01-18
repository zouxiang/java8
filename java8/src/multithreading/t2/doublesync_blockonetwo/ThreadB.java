package multithreading.t2.doublesync_blockonetwo;

public class ThreadB extends Thread {
	private ObjectService service;
	
	public ThreadB(ObjectService service) {
		super();
		this.service = service;
	}
	
	public void run() {
		super.run();
		service.serviceMethodB();
	}
}
