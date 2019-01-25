package multithreading.t6.fair_nofair_test;

public class RunFair {

	public static void main(String[] args) {
		final Service service = new Service(true);
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("A thread " + Thread.currentThread().getName() + " is running.");
				service.serviceMethod();;
			}
		};
		Thread[] threadArray = new Thread[10];
		for(int i=0;i<10;i++) {
			threadArray[i] = new Thread(runnable);
		}
		for(int i=0;i<10;i++) {
			threadArray[i].start();
		}
	}

}
