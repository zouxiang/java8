package multithreading.t2.sync_block_lockall;

public class Run1_3 {

	public static void main(String[] args) {
		Service service = new Service();
		MyObject object = new MyObject();
		ThreadC c = new ThreadC(service, object);
		c.setName("C");
		c.start();
		ThreadD d = new ThreadD(object);
		d.setName("D");
		d.start();
		ThreadE e = new ThreadE(object);
		e.setName("E");
		e.start();
	}

}
