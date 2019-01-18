package multithreading.t1;

public class Run2 {

	public static void main(String[] args) {
		Thread.currentThread().interrupt();
		System.out.println("stop or not 1? = " + Thread.interrupted());
		System.out.println("stop or not 2? = " + Thread.interrupted());
		System.out.println("end.");
	}

}
