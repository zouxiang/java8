package multithreading.t4.stack_1;

public class Run {

	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		P p = new P(myStack);
		C r = new C(myStack);
		ThreadP pThread = new ThreadP(p);
		ThreadC cThread = new ThreadC(r);
		pThread.start();
		cThread.start();

	}

}
