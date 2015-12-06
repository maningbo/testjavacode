package teststructure.thread;
/**
 *  TestThread.java
 *  Description:
 *  
 *  CreateDate: 2015年7月23日 下午5:31:09 
 * 
 *  @author 马宁波
 */
public class TestThread {
	public static void main(String[] args) {
		Thread thread = new Thread() {
			public void run() {
				System.out.println("Thread Running");
			}
		};
		thread.start();
		Thread threadRunnable = new Thread(new MyRunnable());
		threadRunnable.start();
	}
}
