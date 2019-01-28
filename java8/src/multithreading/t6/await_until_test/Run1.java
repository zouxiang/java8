package multithreading.t6.await_until_test;

public class Run1 {

	public static void main(String[] args) throws InterruptedException {
		Service service = new Service();
		MyThreadA myThreadA = new MyThreadA(service);
		myThreadA.start();
		Thread.sleep(2000);
		MyThreadB myThreadB = new MyThreadB(service);
		myThreadB.start();

	}

}
