package multithreading.t2.sync_static_method;

public class ThreadC extends Thread {
	private Service service;
	public ThreadC(Service service) {
		super();
		this.service = service;
	}
	
	public void run() {
		service.printC();
	}
}
