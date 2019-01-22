package multithreading.t4.stack_4;

public class Run {

	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		P p1 = new P(myStack);
		P p2 = new P(myStack);
		P p3 = new P(myStack);
		P p4 = new P(myStack);
		P p5 = new P(myStack);
		P p6 = new P(myStack);
		ThreadP pThread1 = new ThreadP(p1);
		ThreadP pThread2 = new ThreadP(p2);
		ThreadP pThread3 = new ThreadP(p3);
		ThreadP pThread4 = new ThreadP(p4);
		ThreadP pThread5 = new ThreadP(p5);
		ThreadP pThread6 = new ThreadP(p6);
		pThread1.start();
		pThread2.start();
		pThread3.start();
		pThread4.start();
		pThread5.start();
		pThread6.start();
		C r1 = new C(myStack);
		C r2 = new C(myStack);
		C r3 = new C(myStack);
		C r4 = new C(myStack);
		C r5 = new C(myStack);
		ThreadC cThread1 = new ThreadC(r1);
		ThreadC cThread2 = new ThreadC(r2);
		ThreadC cThread3 = new ThreadC(r3);
		ThreadC cThread4= new ThreadC(r4);
		ThreadC cThread5 = new ThreadC(r5);
		cThread1.start();
		cThread2.start();
		cThread3.start();
		cThread4.start();
		cThread5.start();
	}

}
