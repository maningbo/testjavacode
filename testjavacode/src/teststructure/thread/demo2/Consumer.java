package teststructure.thread.demo2;

/**
 * Consumer.java Description:
 * 
 * CreateDate: 2015年7月24日 上午9:23:38
 * 
 * @author 马宁波
 */
public class Consumer implements Runnable {

	private EventStorage storage;

	public Consumer(EventStorage storage) {
		this.storage = storage;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			storage.get();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}