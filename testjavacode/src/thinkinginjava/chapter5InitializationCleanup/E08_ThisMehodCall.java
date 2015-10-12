package thinkinginjava.chapter5InitializationCleanup;
/**
 *  E08_ThisMehodCall.java
 *  Description:
 *  
 *  CreateDate: 2015年10月12日 上午11:27:00 
 * 
 *  @author 马宁波
 */
public class E08_ThisMehodCall {
	String s;
	public E08_ThisMehodCall(String s){
		this.s = s;
	}
	public void a(){
		b();
		this.b();
	}
	public void b(){
		System.out.println("b() called");
		System.out.println("s="+s);
	}
	public static void main(String[] args) {
		new E08_ThisMehodCall("2").a();
		new E08_ThisMehodCall("3").a();
	}
}
