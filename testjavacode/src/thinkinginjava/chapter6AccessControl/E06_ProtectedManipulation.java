package thinkinginjava.chapter6AccessControl;
/**
 *  E06_ProtectedManipulation.java
 *  Description:
 *  
 *  CreateDate: 2015年10月13日 上午9:55:09 
 * 
 *  @author 马宁波
 */

class WithProtected{
	protected int i;
}

public class E06_ProtectedManipulation {
	public static void main(String[] args) {
		WithProtected wp = new WithProtected();
		wp.i = 34;
		System.out.println("wp.i="+wp.i);
	}
}
