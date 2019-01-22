package multithreading.t4.p_c_all_wait_fix;

public class C {
	private String lock;
	public C(String lock) {
		super();
		this.lock = lock;
	}
	
	public void getValue() {
		try {
			synchronized(lock) {
				while(ValueObject.value.equals("")) {
					System.out.println("Consumer " + Thread.currentThread().getName() + " is waiting");
					lock.wait();
				}
				System.out.println("Consumer " + Thread.currentThread().getName() + " is runnable");
				System.out.println("get value is " + ValueObject.value);
				ValueObject.value = "";
				lock.notifyAll();
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
