package multithreading.t7.singleton_static_inner_class;

public class MyThread extends Thread {
	public void run() {
		System.out.println(MyObject.getInstance().hashCode());
	}
}
