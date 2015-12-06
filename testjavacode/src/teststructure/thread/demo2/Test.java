package teststructure.thread.demo2;
/**
 *  Test.java
 *  Description:
 *  
 *  CreateDate: 2015年7月24日 上午9:24:15 
 * 
 *  @author 马宁波
 */
public class Test {

	public static void main(String[] args) {
		EventStorage storage = new EventStorage();
		
		Producer producer = new Producer(storage);
		Thread thread1 = new Thread(producer);

		Consumer consumer = new Consumer(storage);
		Thread thread2 = new Thread(consumer);

		thread1.start();
		thread2.start();
	}
}
