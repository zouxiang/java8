package multithreading.t2.syn_block;

public class Task {
	public String getData1;
	public String getData2;
	
//	public synchronized void doLongTimeTask() {
	public void doLongTimeTask() {
		try{
			System.out.println("begin task");
			Thread.sleep(3000);
//			getData1 = "long time running taks return 1 threadName=" + Thread.currentThread().getName();
//			getData2 = "long time running taks return 2 threadName=" + Thread.currentThread().getName();
			String privateGetData1 = "long time running taks return 1 threadName=" + Thread.currentThread().getName();
			String privateGetData2 = "long time running taks return 2 threadName=" + Thread.currentThread().getName();
			synchronized(this) {
				getData1 = privateGetData1;
				getData2 = privateGetData2;
			}
			System.out.println(getData1);
			System.out.println(getData2);
			System.out.println("end task");
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
