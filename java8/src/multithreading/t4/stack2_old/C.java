package multithreading.t4.stack2_old;

public class C {
	private MyStack myStack;
	public C(MyStack myStack) {
		super();
		this.myStack = myStack;
	}
	
	public void popService() {
		System.out.println("pop=" + myStack.pop());
	}
}
