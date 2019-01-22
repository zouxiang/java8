package multithreading.t4.two_thread_trans_data;

public class ThreadB extends Thread {
	private MyList list;
	public ThreadB(MyList list) {
		super();
		this.list = list;
	}
	
	public void run() {
		try {
			while(true) {
				synchronized(list) {
					if(list.size() == 5) {
						System.out.println("==5, thread B will exit.");
						throw new InterruptedException();
					}
				}
			}
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
