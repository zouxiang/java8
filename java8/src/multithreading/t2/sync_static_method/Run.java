package multithreading.t2.sync_static_method;

public class Run {

	public static void main(String[] args) {
		Service service = new Service();
		ThreadA a = new ThreadA();
		a.setName("A");
		a.start();
		ThreadB b = new ThreadB();
		b.setName("B");
		b.start();
		ThreadC c = new ThreadC(service);
		c.setName("C");
		c.start();

	}

}
