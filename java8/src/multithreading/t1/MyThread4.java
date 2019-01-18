package multithreading.t1;

public class MyThread4 extends Thread {
	private int i = 0;
	
	public void run() {
		try{
			while(true) {
				i++;
				System.out.println("i=" + i);
				Thread.sleep(1000);
			}
		} catch(InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}
