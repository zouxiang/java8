package multithreading.t2.inner_class_lock;

public class OutClass {
	static class Inner {
		public void method1() {
			synchronized("other lock") {
//			synchronized(this) {
				for (int i=0; i<=10; i++) {
					System.out.println(Thread.currentThread().getName() + " i=" +i);
					try {
						Thread.sleep(100);
					} catch(InterruptedException e) {
						
					}
				}
			}
		}
		
		public synchronized void method2() {
			for (int i=11; i<=20; i++) {
				System.out.println(Thread.currentThread().getName() + " i=" + i);
				try {
					Thread.sleep(100);
				} catch(InterruptedException e) {
					
				}
			}
		}
	}

}
