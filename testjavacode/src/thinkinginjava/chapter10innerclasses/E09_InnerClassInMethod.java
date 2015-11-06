package thinkinginjava.chapter10innerclasses;

import thinkinginjava.chapter10innerclasses.exercise6.SimpleInterface;

/**
 *  E09_InnerClassInMethod.java
 *  Description:
 *  Create an interface with at least one method.
 *  and implement it by defining an 
 *  inner class within a method that returns a 
 *  reference to your interface.
 *  CreateDate: 2015年11月3日 上午8:50:19 
 * 
 *  @author 马宁波
 */
public class E09_InnerClassInMethod {
	public SimpleInterface get(){
		class SI implements SimpleInterface{
			public void f(){System.out.println("SI.f");}
		}
		return new SI();
	}
	public static void main(String[] args) {
		SimpleInterface si = new E09_InnerClassInMethod().get();
		si.f();
	}
}
