package multithreading.t5.join_test1;

public class Test {
	public static void main(String[] args) {
		try {
			MyThread threadTest = new MyThread();
			threadTest.start();
			threadTest.join();
			System.out.println("This is run after threadTest execution.");
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
}
