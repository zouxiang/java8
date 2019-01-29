package multithreading.t7.singleton_serialization;

import java.io.Serializable;

public class MyObject implements Serializable {
	private static final long serialVersionUID = 5850696201115148321L;
	
	private static class MyObjectHandler {
		private static final MyObject myObject = new MyObject();
	}
	
	private MyObject() {}
	
	public static MyObject getInstance() {
		return MyObjectHandler.myObject;
	}
	
	protected Object readResolve() {
		System.out.println("invoke readResolve method");
		return MyObjectHandler.myObject;
	}
	
}
