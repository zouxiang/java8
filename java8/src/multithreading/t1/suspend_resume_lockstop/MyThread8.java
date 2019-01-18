package multithreading.t1.suspend_resume_lockstop;

public class MyThread8 extends Thread {
	private long i = 0;
	
	public void run() {
		while(true) {
			i++;
			System.out.println(i);
		}
	}
}
