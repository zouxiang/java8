package multithreading.t5.thread_local_2;

public class Run {

	public static void main(String[] args) {
		try {
			for(int i=0;i<10;i++) {
				System.out.println("get value from main thread =" + Tools.t1.get());
				Thread.sleep(100);
			}
			Thread.sleep(1000);
			ThreadA a = new ThreadA();
			a.start();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
