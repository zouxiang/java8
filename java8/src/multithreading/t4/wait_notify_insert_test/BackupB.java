package multithreading.t4.wait_notify_insert_test;

public class BackupB extends Thread {
	private DBTools dbTools;

	public BackupB(DBTools dbTools) {
		super();
		this.dbTools = dbTools;
	}

	public void run() {
		dbTools.backupB();
	}
}
