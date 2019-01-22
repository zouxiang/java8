package multithreading.t4.p_c_all_wait;

public class P {
	private String lock;

	public P(String lock) {
		super();
		this.lock = lock;
	}

	public void setValue() {
		try {
			synchronized (lock) {
				while (!ValueObject.value.equals("")) {
					System.out.println("Producer " + Thread.currentThread().getName() + " is waiting");
					lock.wait();
				}
				System.out.println("Producer " + Thread.currentThread().getName() + " is runnable");
				String value = System.currentTimeMillis() + "_" + System.nanoTime();
				System.out.println("set value is " + value);
				ValueObject.value = value;
				lock.notify();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
