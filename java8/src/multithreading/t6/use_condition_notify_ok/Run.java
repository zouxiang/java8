package multithreading.t6.use_condition_notify_ok;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		MyService service = new MyService();
		MyThread a = new MyThread(service);
		a.start();
		Thread.sleep(3000);
		service.signal();
	}

}
