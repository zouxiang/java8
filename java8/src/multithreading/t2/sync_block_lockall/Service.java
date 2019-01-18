package multithreading.t2.sync_block_lockall;

public class Service {
	public void testMethod1(MyObject object) {
		try {
			synchronized(object) {
				System.out.println("testMethod1 __ getLock time=" + System.currentTimeMillis() + " run ThreadName=" + Thread.currentThread().getName());
				Thread.sleep(5000);
				System.out.println("testMethod1 __ releaseLock time=" + System.currentTimeMillis() + " run ThreadName=" + Thread.currentThread().getName());
			} 
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
