package multithreading.t1.suspend_resume_lock;

public class Run11 {

	public static void main(String[] args) {
		try {
			final SynchronizedObject object = new SynchronizedObject();
			Thread thread1 = new Thread() {
				public void run() {
					object.printString();
				}
			};
			thread1.setName("a");
			thread1.start();
			Thread.sleep(1000);
			Thread thread2 = new Thread() {
				public void run() {
					System.out.println("thread2 started, but can't get into printString() method. Only 1 begin printed");
					System.out.println("printString method is locked by a thread and suspended forever.");
					object.printString();
				}
			};
			thread2.start();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}

	}

}
