package thinkinginjava.chapter5InitializationCleanup;
/**
 *  E09_ThisConstructorCall.java
 *  Description:
 *  
 *  CreateDate: 2015年10月12日 上午11:32:57 
 * 
 *  @author 马宁波
 */
public class E09_ThisConstructorCall {
	public E09_ThisConstructorCall(String s) {
		System.out.println("s="+s);
	}
	public E09_ThisConstructorCall(String s,int a){
		System.out.println("String and int constructor");
	}
	public E09_ThisConstructorCall(int i){
		this("i="+i);
//		this("",4);
	}
	public static void main(String[] args) {
		new E09_ThisConstructorCall("String call");
		new E09_ThisConstructorCall(47);
	}
}
