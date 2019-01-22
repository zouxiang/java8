package multithreading.t4.wait_notify_size5;

public class ThreadB extends Thread {
	private Object lock;

	public ThreadB(Object lock) {
		super();
		this.lock = lock;
	}

	public void run() {
		try {
			synchronized(lock) {
				for(int i=0;i<10;i++) {
					MyList.add();
					if(MyList.size() == 5) {
						lock.notify();
						System.out.println("Notification sent.");
					}
					System.out.println("Added " + (i+1) + " elements");
					Thread.sleep(1000);
				}
			}
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
