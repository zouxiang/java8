package multithreading.t6.lock_method_test2;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		Service service = new Service();
		Runnable runnable = new Runnable() {
			public void run() {
				service.serviceMethod();
			}
		};
		Thread[] threadArray = new Thread[10];
		for(int i=0;i<10;i++) {
			threadArray[i] = new Thread(runnable);
		}
		for(int i=0;i<10;i++) {
			threadArray[i].start();
		}
		Thread.sleep(2000);
		System.out.println("There are " + service.lock.getQueueLength() + " threads are waiting for getting lock.");
	}

}
