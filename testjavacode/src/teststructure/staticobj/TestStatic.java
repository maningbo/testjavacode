package teststructure.staticobj;
/**
 *  TestStatic.java
 *  Description:
 *  
 *  CreateDate: 2015年7月23日 上午11:36:08 
 * 
 *  @author 马宁波
 */
public class TestStatic {
	
	static{
		System.out.println("静态代码块1");
		try {
			Class.forName("teststatic.TeststaticValueModel");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
//		new TeststaticValueModel();
	}
	
	TestStatic(){
		System.out.println("无参构造1");
	}
	
	static void staticmethod(){
		System.out.println("静态方法1");
	}

	public static void main(String[] args) {
		staticmethod();
	}
}
