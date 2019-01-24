package multithreading.t6.condition_test_m_2_m;

public class ThreadB extends Thread {
private MyService service;
	
	public ThreadB(MyService service) {
		super();
		this.service = service;
	}
	
	public void run() {
		for(int i=0;i<Integer.MAX_VALUE;i++){
			service.get();;
		}
	}
}
