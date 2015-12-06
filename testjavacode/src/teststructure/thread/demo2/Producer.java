package teststructure.thread.demo2;

/**
 * Producer.java Description:
 * 
 * CreateDate: 2015年7月24日 上午9:23:05
 * 
 * @author 马宁波
 */
public class Producer implements Runnable {

	private EventStorage storge;

	public Producer(EventStorage storage) {
		this.storge = storage;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			storge.set();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}