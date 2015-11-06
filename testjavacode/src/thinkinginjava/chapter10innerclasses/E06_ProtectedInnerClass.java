package thinkinginjava.chapter10innerclasses;

import thinkinginjava.chapter10innerclasses.exercise6.SimpleInterface;
import thinkinginjava.chapter10innerclasses.exercise6b.SimpleClass;

/**
 *  E06_ProtectedInnerClass.java
 *  Description:
 *  
 *  CreateDate: 2015年11月2日 上午8:56:10 
 * 
 *  @author 马宁波
 */
public class E06_ProtectedInnerClass extends SimpleClass{
	public SimpleInterface get(){
		return new Inner();
	}
	public static void main(String[] args) {
		new E06_ProtectedInnerClass().get().f();
	}
}
