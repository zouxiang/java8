package multithreading.t4.stack2_new_final;

public class Run {

	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		P p = new P(myStack);
		C r1 = new C(myStack);
		C r2 = new C(myStack);
		C r3 = new C(myStack);
		C r4 = new C(myStack);
		C r5 = new C(myStack);
		ThreadP pThread = new ThreadP(p);
		ThreadC cThread1 = new ThreadC(r1);
		ThreadC cThread2 = new ThreadC(r2);
		ThreadC cThread3 = new ThreadC(r3);
		ThreadC cThread4= new ThreadC(r4);
		ThreadC cThread5 = new ThreadC(r5);
		pThread.start();
		cThread1.start();
		cThread2.start();
		cThread3.start();
		cThread4.start();
		cThread5.start();
	}

}
