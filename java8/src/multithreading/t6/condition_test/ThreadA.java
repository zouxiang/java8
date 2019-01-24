package multithreading.t6.condition_test;

public class ThreadA extends Thread {
	private MyService service;
	
	public ThreadA(MyService service) {
		super();
		this.service = service;
	}
	
	public void run() {
		for(int i=0;i<100;i++){
			service.set();
		}
		
	}
}
