package multithreading.t1;

public class MyThreadS extends Thread {
	public SynchronizedObject object;
	
	public MyThreadS(SynchronizedObject obj) {
		super();
		this.object = obj;
	}
	
	public void run() {
		object.printString("b", "bb");
	}
}
