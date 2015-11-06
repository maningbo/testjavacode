package thinkinginjava.chapter10innerclasses;

import thinkinginjava.chapter10innerclasses.exercise6.SimpleInterface;

/**
 *  E13_AnonymousInnerClassInMethod.java
 *  Description:
 *  
 *  CreateDate: 2015年11月5日 上午8:11:28 
 * 
 *  @author 马宁波
 */
public class E13_AnonymousInnerClassInMethod {
	public SimpleInterface get(){
		return new SimpleInterface(){
			public void f(){
				System.out.println("SimpleInterface.f");
			}
		};
	}
	public static void main(String[] args) {
		SimpleInterface si = new E13_AnonymousInnerClassInMethod().get();
		si.f();
	}
}
