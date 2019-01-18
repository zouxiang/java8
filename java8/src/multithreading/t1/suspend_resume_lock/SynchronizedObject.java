package multithreading.t1.suspend_resume_lock;

public class SynchronizedObject {
	synchronized public void printString() {
		System.out.println("begin");
		if (Thread.currentThread().getName().equals("a")) {
			System.out.println("a thread suspend forever.");
			Thread.currentThread().suspend();
		}
		System.out.println("end");
	}
}
