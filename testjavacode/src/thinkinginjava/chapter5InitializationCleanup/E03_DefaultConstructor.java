package thinkinginjava.chapter5InitializationCleanup;
/**
 *  E03_DefaultConstructor.java
 *  Description:
 *  
 *  CreateDate: 2015年10月12日 上午10:40:31 
 * 
 *  @author 马宁波
 */
public class E03_DefaultConstructor {
	public E03_DefaultConstructor() {
		System.out.println("Default constructor");
	}
	public static void main(String[] args) {
		new E03_DefaultConstructor();
	}
}
