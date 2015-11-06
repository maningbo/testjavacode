package thinkinginjava.chapter10innerclasses.exercise6b;

import thinkinginjava.chapter10innerclasses.exercise6.SimpleInterface;

/**
 *  SimpleClass.java
 *  Description:
 *  
 *  CreateDate: 2015年11月2日 上午9:04:48 
 * 
 *  @author 马宁波
 */
public class SimpleClass {
	protected class Inner implements SimpleInterface{
		//Force constructor to be public:
		public Inner() {}
		public void f() {System.out.println("-----");}
	}
}
