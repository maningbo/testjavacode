package thinkinginjava.chapter10innerclasses;

import thinkinginjava.chapter10innerclasses.exercise6.SimpleInterface;

/**
 *  E10_InnerClassInScope.java
 *  Description:
 *  
 *  CreateDate: 2015年11月3日 上午8:55:59 
 * 
 *  @author 马宁波
 */
public class E10_InnerClassInScope {
	public SimpleInterface get(){
		{
			class SI implements SimpleInterface{
				public void f(){
					System.out.println("SI.f");
				}
			}
			return new SI();
		}
	}
	public static void main(String[] args) {
		//The inner class remains visible only if the return statement 
		//is in its scope;if not,the inner class definition goes out of scope.
		SimpleInterface si = new E10_InnerClassInScope().get();
		si.f();
	}
}
