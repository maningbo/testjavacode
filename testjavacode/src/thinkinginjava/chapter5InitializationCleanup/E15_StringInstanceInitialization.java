package thinkinginjava.chapter5InitializationCleanup;
/**
 *  E15_StringInstanceInitialization.java
 *  Description:
 *  
 *  CreateDate: 2015年10月12日 下午1:43:59 
 * 
 *  @author 马宁波
 */
public class E15_StringInstanceInitialization {
	String s;
	{
		s = "'instance initialization'";
	}
	public E15_StringInstanceInitialization() {
		System.out.println("Default constructor:s="+s);
	}
	public E15_StringInstanceInitialization(int i){
		System.out.println("int constructor:s="+s);
	}
	public static void main(String[] args) {
		new E15_StringInstanceInitialization();
		new E15_StringInstanceInitialization(6);
	}
}
