package multithreading.t2.syn_block_string;

public class Service {
	private String usernameParam;
	private String passwordParam;
	
	private String anyString = new String();
	
	public void setUsernamePassword(String username, String password) {
		try {
			synchronized(anyString) {
				System.out.println("Thread name is: " + Thread.currentThread().getName() + " Enter sync block at " + System.currentTimeMillis());
				usernameParam = username;
				Thread.sleep(3000);
				passwordParam = password;
				System.out.println("Thread name is: " + Thread.currentThread().getName() + " Leave sync block at " + System.currentTimeMillis());
			}
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
