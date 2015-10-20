package thinkinginjava.chapter9Interfaces;

import thinkinginjava.chapter9Interfaces.ownpackage.AnInterface;

/**
 *  E06_InterfacePublicMethod.java
 *  Description:
 *  
 *  CreateDate: 2015年10月19日 上午9:33:20 
 * 
 *  @author 马宁波
 */
public class E06_InterfacePublicMethod 
	implements AnInterface{
	//Each of these produces a compile-time error message.
	//stating that you cannot reduce the access of the
	//base class public method in a derived class.
//	void f(){}
//	void g(){}
//	void h(){}
	// Compiles ok
	public void f(){}
	public void g(){}
	public void h(){}
	public static void main(String args[]){}
}
