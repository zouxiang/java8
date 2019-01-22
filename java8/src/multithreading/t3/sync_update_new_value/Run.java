package multithreading.t3.sync_update_new_value;

public class Run {

	public static void main(String[] args) {
		try {
			Service service = new Service();
			ThreadA a = new ThreadA(service);
			a.start();
			Thread.sleep(1000);
			ThreadB b = new ThreadB(service);
			b.start();
			System.out.println("stop command sent!");
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
