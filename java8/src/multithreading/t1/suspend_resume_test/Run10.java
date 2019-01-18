package multithreading.t1.suspend_resume_test;

public class Run10 {

	public static void main(String[] args) {
		try {
			MyThread7 thread = new MyThread7();
			thread.start();
			Thread.sleep(5000);
			//A sec
			thread.suspend();
			System.out.println("A= "+System.currentTimeMillis() + " i=" + thread.getI());
			Thread.sleep(5000);
			System.out.println("A= "+System.currentTimeMillis() + " i=" + thread.getI());
			//B sec
			thread.resume();
			Thread.sleep(5000);
			//C sec
			thread.suspend();
			System.out.println("B= "+System.currentTimeMillis() + " i=" + thread.getI());
			Thread.sleep(5000);
			System.out.println("B= "+System.currentTimeMillis() + " i=" + thread.getI());
			
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
