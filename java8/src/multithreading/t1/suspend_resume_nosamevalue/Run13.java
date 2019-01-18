package multithreading.t1.suspend_resume_nosamevalue;

public class Run13 {

	public static void main(String[] args) throws InterruptedException {
		final MyObject myObject = new MyObject();
		Thread thread1 = new Thread() {
			public void run() {
				myObject.setValue("a", "aa");
			};
		};
		thread1.setName("a");
		thread1.start();
		Thread.sleep(500);
		Thread thread2 = new Thread() {
			public void run() {
				myObject.printUsernamePassword();
			}
		};
		thread2.start();
	}

}
