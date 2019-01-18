package multithreading.t1.suspend_resume_lockstop;

public class Run12 {

	public static void main(String[] args) {
		try{
			MyThread8 thread = new MyThread8();
			thread.start();
			Thread.sleep(1000);
			thread.suspend();
			System.out.println("main end.");
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
