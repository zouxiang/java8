package multithreading.t5.join_exception;

public class ThreadB extends Thread {
	public void run() {
		try {
			ThreadA a = new ThreadA() ;
			a.start();
			a.join();
			System.out.println("Thread B print at run end");
		}catch(InterruptedException e) {
			System.out.println("Thread B print at catch block");
			e.printStackTrace();
		}
	}
}
