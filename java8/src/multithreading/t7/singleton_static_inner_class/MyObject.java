package multithreading.t7.singleton_static_inner_class;

public class MyObject {
	private static class MyObjectHandler {
		private static MyObject myObject = new MyObject();
	}
	
	private MyObject() {}
	
	public static MyObject getInstance() {
		return MyObjectHandler.myObject;
	}
}
