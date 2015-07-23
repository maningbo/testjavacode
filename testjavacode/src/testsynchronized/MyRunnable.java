package testsynchronized;
/**
 *  MyRunnable.java
 *  Description:
 *  
 *  CreateDate: 2015年7月23日 下午5:35:54 
 * 
 *  @author 马宁波
 */
public class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("MyRunnable线程1");
	}

	public static void main(String[] args) {
		Thread myRunnable = new Thread(new MyRunnable());
		myRunnable.start();
	}
}
