package multithreading.t4.two_thread_trans_data;

public class ThreadA extends Thread {
	private MyList list;
	public ThreadA(MyList list) {
		super();
		this.list = list;
	}
	
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				synchronized(list) {
					list.add();
				}
				System.out.println("Added " + (i+1) + " elements.");
				Thread.sleep(1000);
			}
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
