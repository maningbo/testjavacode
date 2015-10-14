package thinkinginjava.chapter7ReusingClasses;
/**
 *  E05_SimpleInheritance.java
 *  Description:
 *  
 *  CreateDate: 2015年10月13日 下午3:25:45 
 * 
 *  @author 马宁波
 */

class A{
	public A(){System.out.println("A()");}
}

class B{
	public B(){System.out.println("B()");}
}

class C extends A{
	B b = new B();
}

public class E05_SimpleInheritance {
	public static void main(String[] args) {
		new C();
	}
}
