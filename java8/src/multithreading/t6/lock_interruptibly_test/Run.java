package multithreading.t6.lock_interruptibly_test;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		final MyService service = new MyService();
		Runnable runnableRef = new Runnable() {
			public void run() {
				service.waitMethod();
			}
		};
		Thread threadA = new Thread(runnableRef);
		threadA.setName("A");
		threadA.start();
		Thread.sleep(500);
		Thread threadB = new Thread(runnableRef);
		threadB.setName("B");
		threadB.start();
		threadB.interrupt();
		System.out.println("main end");
	}

}
