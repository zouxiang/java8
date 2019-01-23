package multithreading.t6.use_condition_wait_notify_error;

public class Run {

	public static void main(String[] args) {
		MyService service = new MyService();
		MyThread a = new MyThread(service);
		a.start();
	}

}
