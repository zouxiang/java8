package multithreading.t1.suspend_resume_nosamevalue;

public class MyObject {
	private String username = "1";
	private String password = "11";
	
	public void setValue(String u, String p) {
		this.username = u;
		if(Thread.currentThread().getName().equals("a")) {
			System.out.println("suspend thread a");
			Thread.currentThread().suspend();
		}
		this.password = p;
	}
	
	public void printUsernamePassword() {
		System.out.println(username + " " + password);
	}
}
