package multithreading.t1;

public class RunS {

	public static void main(String[] args) {
		try {
			SynchronizedObject obj = new SynchronizedObject();
			MyThreadS thread = new MyThreadS(obj);
			thread.start();
			Thread.sleep(500);
			thread.stop();
			System.out.println(obj.getUsername() + " " + obj.getPassword());
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}

	}

}
