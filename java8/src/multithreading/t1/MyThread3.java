package multithreading.t1;

public class MyThread3 extends Thread{
	public void run() {
		super.run();
		try {
			for(int i=0;i<100000;i++) {
				System.out.println("i=" + (i + 1));
			}
			System.out.println("run begin");
			Thread.sleep(200000);
			System.out.println("run end");
		} catch (InterruptedException ex) {
			System.out.println("stop first, then meet catch! get into catch.");
			ex.printStackTrace();
		}
	}
}
