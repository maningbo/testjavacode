package thinkinginjava.chapter5InitializationCleanup;
/**
 *  E11_FinalizeAlwaysCalled.java
 *  Description:
 *  
 *  CreateDate: 2015年10月12日 下午1:05:30 
 * 
 *  @author 马宁波
 */
public class E11_FinalizeAlwaysCalled {
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("finalize() called");
	}
	public static void main(String[] args) {
		new E11_FinalizeAlwaysCalled();
		System.gc();
		System.runFinalization();
	}
}
