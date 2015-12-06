package teststructure.thread.demo2;

/**
 *  EventStorage.java
 *  Description:
 *  
 *  CreateDate: 2015年7月24日 上午9:22:26 
 * 
 *  @author 马宁波
 */
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class EventStorage {

	private int maxSize;

	private List<Date> storage;

	public EventStorage() {
		maxSize = 10;
		storage = new LinkedList<Date>();
	}

	public synchronized void set() {
		while (storage.size() == maxSize) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		storage.add(new Date());
//		System.out.printf("Set: %d", storage.size());
		System.out.println("Set:"+storage.size());
		notifyAll();
	}

	public synchronized void get() {
		while (storage.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		storage.remove(storage.size()-1);
//		System.out.printf("Get: %d: %s", storage.size(),
//				((LinkedList<?>) storage).poll());
		System.out.println("Get" + storage.size());
		notifyAll();
	}
}