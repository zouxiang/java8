package multithreading.t4.wait_notify_insert_test;

public class BackupA extends Thread {
	private DBTools dbTools;
	
	public BackupA(DBTools dbTools) {
		super();
		this.dbTools = dbTools;
	}
	
	public void run() {
		dbTools.backupA();
	}
}
