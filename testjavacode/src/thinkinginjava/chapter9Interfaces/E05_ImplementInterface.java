package thinkinginjava.chapter9Interfaces;

import thinkinginjava.chapter9Interfaces.ownpackage.AnInterface;

/**
 *  E05_ImplementInterface.java
 *  Description:
 *  
 *  CreateDate: 2015年10月16日 下午5:48:18 
 * 
 *  @author 马宁波
 */

class ImplementInterface implements AnInterface{
	public void f(){System.out.println("ImplementInterface.f");}
	public void g(){System.out.println("ImplementInterface.g");}
	public void h(){System.out.println("ImplementInterface.h");}
}

public class E05_ImplementInterface {
	public static void main(String[] args) {
		ImplementInterface imp = new ImplementInterface();
		imp.f();
		imp.g();
		imp.h();
	}
}
