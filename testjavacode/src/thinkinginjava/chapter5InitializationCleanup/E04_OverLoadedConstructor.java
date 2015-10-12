package thinkinginjava.chapter5InitializationCleanup;
/**
 *  E04_OverLoadedConstructor.java
 *  Description:
 *  
 *  CreateDate: 2015年10月12日 上午10:49:48 
 * 
 *  @author 马宁波
 */
public class E04_OverLoadedConstructor {
	E04_OverLoadedConstructor() {
		System.out.println("Default constructor");
	}
	E04_OverLoadedConstructor(String s){
		System.out.println("String arg constructor");
		System.out.println(s);
	}
	public static void main(String[] args) {
		//Call default constructor
		new E04_OverLoadedConstructor();
		//Call overloaded version
		new E04_OverLoadedConstructor("Overloaded");
	}
}
