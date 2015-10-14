package thinkinginjava.chapter7ReusingClasses;

import thinkinginjava.chapter7ReusingClasses.protect.E15_Protected;

/**
 *  E15_ProtectedTest.java
 *  Description:
 *  
 *  CreateDate: 2015年10月13日 下午5:17:31 
 * 
 *  @author 马宁波
 */

class Derived extends E15_Protected{
	public void g(){
		f();//Accessible in derived class
		System.out.println("Accessible in derived class");
	}
}

public class E15_ProtectedTest {
	public static void main(String[] args) {
		new Derived().g();
	}
}
