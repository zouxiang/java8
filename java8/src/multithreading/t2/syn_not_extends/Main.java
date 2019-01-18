package multithreading.t2.syn_not_extends;

public class Main {
	synchronized public void serviceMethod() {
		try {
			System.out.println("int main next step sleep begin threadName=" + Thread.currentThread().getName() + " time=" +System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("int main next step sleep end threadName=" + Thread.currentThread().getName() + " time=" +System.currentTimeMillis());
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
