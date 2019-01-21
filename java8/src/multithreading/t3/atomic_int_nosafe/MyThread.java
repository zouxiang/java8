package multithreading.t3.atomic_int_nosafe;

public class MyThread extends Thread {
	private MyService myService;
	public MyThread(MyService myService) {
		super();
		this.myService = myService;
	}
	
	public void run() {
		myService.addNum();
	}
}
