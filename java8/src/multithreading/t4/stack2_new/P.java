package multithreading.t4.stack2_new;

public class P {
	private MyStack myStack;
	public P(MyStack myStack) {
		super();
		this.myStack = myStack;
	}
	
	public void pushService() {
		myStack.push();
	}
}
