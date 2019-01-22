package multithreading.t3.sync_update_new_value;

public class Service {
	private boolean isContinueRun = true;
	
	public void runMethod() {
		String anyString = new String();
		while(isContinueRun) {
			synchronized(anyString){
			}
		}
		System.out.println("Stopped!");
	}
	
	public void stopMethod() {
		this.isContinueRun = false;
	}
}
