package multithreading.t3.volatile_test;

public class Run {

	public static void main(String[] args) {
		Mythread[] mythreadArray = new Mythread[100];
		for (int i = 0; i < 100; i++) {
			mythreadArray[i] = new Mythread();
		}
		for (int i = 0; i < 100; i++) {
			mythreadArray[i].start();
		}

	}

}
