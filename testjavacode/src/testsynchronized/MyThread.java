package testsynchronized;
/**
 *  MyThread.java
 *  Description:
 *  
 *  CreateDate: 2015年7月23日 下午5:29:45 
 * 
 *  @author 马宁波
 */
public class MyThread extends Thread{

	@Override
	public void run() {
		System.out.println("MyThread线程1");
	}
	
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
	}
}
