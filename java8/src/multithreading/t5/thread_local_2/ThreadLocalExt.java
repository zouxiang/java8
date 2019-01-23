package multithreading.t5.thread_local_2;

import java.util.Date;

public class ThreadLocalExt extends ThreadLocal {

	@Override
	protected Object initialValue() {
		return new Date().getTime();
	}
	
}
