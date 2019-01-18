package multithreading.t2.syn_not_extends;

public class Sub extends Main {
	public void serviceMethod() {
//		synchronized public void serviceMethod() {
		try {
			System.out.println("int sub next step sleep begin threadName=" + Thread.currentThread().getName() + " time=" +System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("int sub next step sleep end threadName=" + Thread.currentThread().getName() + " time=" +System.currentTimeMillis());
			super.serviceMethod();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
