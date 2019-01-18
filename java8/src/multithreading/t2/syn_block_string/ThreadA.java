package multithreading.t2.syn_block_string;

public class ThreadA extends Thread {
	private Service service;
	
	public ThreadA(Service service) {
		super();
		this.service = service;
	}
	
	public void run() {
		service.setUsernamePassword("a", "aa");
	}
}
