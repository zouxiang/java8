package multithreading.t6.condition_test;

public class ThreadB extends Thread {
private MyService service;
	
	public ThreadB(MyService service) {
		super();
		this.service = service;
	}
	
	public void run() {
		for(int i=0;i<100;i++){
			service.get();;
		}
	}
}
