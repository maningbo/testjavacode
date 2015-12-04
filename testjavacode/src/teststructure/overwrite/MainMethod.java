package teststructure.overwrite;
/**
 *  MainMethod.java
 *  Description:
 *  
 *  CreateDate: 2015年9月16日 下午5:51:44 
 * 
 *  @author 马宁波
 */
public class MainMethod {
	public static void main(String[] args) {
		TestInterface t = new TestInterfaceImpl();
		t.hello();
	}
}
