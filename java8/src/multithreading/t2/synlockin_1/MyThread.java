package multithreading.t2.synlockin_1;

public class MyThread extends Thread {
	public void run() {
		Service service = new Service();
		service.service1();
	}
	
	public static void main(String[] args) {
		MyThread t  = new MyThread();
		t.start();
	}
}
