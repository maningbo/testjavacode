package thinkinginjava.access;

import thinkinginjava.chapter6AccessControl.E05_AccessControl;

/**
 *  E05_Other.java
 *  Description:
 *  
 *  CreateDate: 2015年10月13日 上午9:45:37 
 * 
 *  @author 马宁波
 */
public class E05_Other {
	public static void main(String[] args) {
		E05_AccessControl test = new E05_AccessControl();
		test.a = 1;
//		test.b;//Can't access:private
//		test.c;//Can't access:protected
//		test.d;//Can't access:package
		test.f1();
//		test.f2();//Can't access:private
//		test.f3();//Can't access:protected
//		test.f4();//Can't access:package
	}
}
