package multithreading.t2.syn_block_string;

public class ThreadB extends Thread {
private Service service;
	
	public ThreadB(Service service) {
		super();
		this.service = service;
	}
	
	public void run() {
		service.setUsernamePassword("b", "bb");
	}
}
