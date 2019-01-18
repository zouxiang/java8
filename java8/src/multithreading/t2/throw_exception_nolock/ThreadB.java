package multithreading.t2.throw_exception_nolock;

public class ThreadB extends Thread {
	private Service service;

	public ThreadB(Service service) {
		super();
		this.service = service;
	}

	public void run() {
		service.testMethod();
	}
}
