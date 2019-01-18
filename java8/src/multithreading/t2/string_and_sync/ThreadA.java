package multithreading.t2.string_and_sync;

public class ThreadA extends Thread {
	private Service service;
	
	public ThreadA(Service service) {
		super();
		this.service = service;
	}
	
	public void run() {
		service.print("AA");
//		service.print(new String("AA"));
	}
}
