package multithreading.t5.thread_local_1;

public class Run {
	public static ThreadLocal t1 = new ThreadLocal();

	public static void main(String[] args) {
		if(t1.get() == null) {
			System.out.println("never give value");
			t1.set("my val");
		}
		System.out.println(t1.get());
		System.out.println(t1.get());
	}

}
