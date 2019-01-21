package multithreading.t3.extthread;

public class RunThread extends Thread {
	volatile private boolean isRunning = true;
	public boolean isRunning() {
		return isRunning;
	}
	
	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}
	
	public void run() {
		System.out.println("Enter run");
		while(isRunning) {
		}
		System.out.println("Thread is stopped.");
	}
}
