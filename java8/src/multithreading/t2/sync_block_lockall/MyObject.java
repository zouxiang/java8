package multithreading.t2.sync_block_lockall;

public class MyObject {
	synchronized public void speedPrintString() {
		System.out.println("speedPrintString __ getLock time=" + System.currentTimeMillis() + " run ThreadName=" + Thread.currentThread().getName());
		System.out.println("-----------------------------------");
		System.out.println("speedPrintString __ releaseLock time=" + System.currentTimeMillis() + " run ThreadName=" + Thread.currentThread().getName());
	}
	
	public void speedPrintString_1() {
		synchronized(this) {
			System.out.println("speedPrintString_1 __ getLock time=" + System.currentTimeMillis() + " run ThreadName=" + Thread.currentThread().getName());
			System.out.println("-----------------------------------");
			System.out.println("speedPrintString_1 __ releaseLock time=" + System.currentTimeMillis() + " run ThreadName=" + Thread.currentThread().getName());
		}
	}
}
