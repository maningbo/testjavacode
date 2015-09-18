package designmode.facade;
/**
 *  Facade.java
 *  Description:
 *  
 *  CreateDate: 2015年9月18日 上午11:37:51 
 * 
 *  @author 马宁波
 */
public class Facade {
	public void test(){
		Module1 m1 = new Module1();
		m1.test1();
		Module2 m2 = new Module2();
		m2.test2();
		Module3 m3 = new Module3();
		m3.test3();
	}
}
