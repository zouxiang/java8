package multithreading.t6.condition_test_m_2_m;

public class ThreadA extends Thread {
	private MyService service;
	
	public ThreadA(MyService service) {
		super();
		this.service = service;
	}
	
	public void run() {
		for(int i=0;i<Integer.MAX_VALUE;i++){
			service.set();
		}
		
	}
}
