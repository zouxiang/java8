package multithreading.t4.two_thread_trans_data;

import java.util.ArrayList;
import java.util.List;

public class MyList {
	private List list = new ArrayList();
	
	public void add() {
		list.add("Pretty");
	}
	
	public int size() {
		return list.size();
	}
}
