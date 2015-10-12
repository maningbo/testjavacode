package thinkinginjava.chapter5InitializationCleanup;
/**
 *  E10_FinalizeCall.java
 *  Description:
 *  
 *  CreateDate: 2015年10月12日 下午1:01:14 
 * 
 *  @author 马宁波
 */
public class E10_FinalizeCall {
	protected void finalize(){
		System.out.println("finalize() called");
	}
	public static void main(String[] args) {
		//You probably won’t see the finalizer called 
		//because the program doesn’t usually generate 
		//enough garbage for the collector to run.
		new E10_FinalizeCall().finalize();
	}
}
