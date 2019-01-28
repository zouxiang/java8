package multithreading.t6.await_uninterruptibly_test1;

public class Run {

	public static void main(String[] args) {
		try {
			Service service = new Service();
			MyThread myThread = new MyThread(service);
			myThread.start();
			Thread.sleep(3000);
			myThread.interrupt();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
