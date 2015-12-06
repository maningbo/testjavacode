package teststructure.staticobj;
/**
 *  TeststaticModel.java
 *  Description:
 *  
 *  CreateDate: 2015年7月23日 上午11:52:15 
 * 
 *  @author 马宁波
 */
public class TeststaticValueModel {

	static{
		System.out.println("静态代码块");
	}
	
	TeststaticValueModel(){
		System.out.println("无参构造");
	}
	
	static void staticmethod(){
		System.out.println("静态方法");
	}
}
