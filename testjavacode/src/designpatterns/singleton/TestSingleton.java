package designpatterns.singleton;
/**
 *  TestSingleton.java
 *  Description:
 *  
 *  CreateDate: 2015年9月18日 下午3:10:21 
 * 
 *  @author 马宁波
 */
public class TestSingleton {
	public static void main(String[] args) throws InterruptedException {
		Singleton s = Singleton.getInstance();
		s.updateProperties();
		Singleton s2 = Singleton.getInstance();
		s2.updateProperties();
		System.out.println(s==s2);
		int i = 0;
		while(true) {
			System.out.println("ddddd "+(++i)+"  "+s.getProperties());
			s.updateProperties();
			Thread.sleep(3000);
		}
	}
}
