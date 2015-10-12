package thinkinginjava.chapter5InitializationCleanup;
/**
 *  E14_StaticStringInitialization.java
 *  Description:
 *  
 *  CreateDate: 2015年10月12日 下午1:36:18 
 * 
 *  @author 马宁波
 */
public class E14_StaticStringInitialization {
	static String s1 = "Initialized at definition";
	static String s2;
	static {
		s2 = "Initialized in static block";
	}
	public static void main(String[] args) {
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
	}
}
