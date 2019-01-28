package multithreading.t6.try_lock_param;

public class Run {

	public static void main(String[] args) {
		final MyService service = new MyService();
		Runnable runnableRef = new Runnable() {
			public void run(){
				System.out.println(Thread.currentThread().getName() + " invoke waitMethod time is: " + System.currentTimeMillis());
				service.waitMethod();
			}
		};
		
		Thread threadA = new Thread(runnableRef);
		threadA.setName("A");
		threadA.start();
		Thread threadB = new Thread(runnableRef);
		threadB.setName("B");
		threadB.start();
	}

}
