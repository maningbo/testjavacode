package thinkinginjava.chapter9Interfaces;
/**
 *  E02_Abstract.java
 *  Description:
 *  
 *  CreateDate: 2015年10月16日 下午5:14:03 
 * 
 *  @author 马宁波
 */

abstract class NoAbstractMethods{
	int a = 10;
	void f(){System.out.println("f()");}
}

public class E02_Abstract {
	public static void main(String[] args) {
		new NoAbstractMethods() {//匿名内部类
			@Override
			void f() {
				System.out.println("========");
				System.out.println(a);
				super.f();
			}
		}.f();
		//cannot create any instances of the abstract class
//		new NoAbstractMethods();
	}
}
