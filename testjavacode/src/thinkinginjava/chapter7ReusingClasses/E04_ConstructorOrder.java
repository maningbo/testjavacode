package thinkinginjava.chapter7ReusingClasses;
/**
 *  E04_ConstructorOrder.java
 *  Description:
 *  
 *  CreateDate: 2015年10月13日 下午3:15:34 
 * 
 *  @author 马宁波
 */

class Base1{
	public Base1(){System.out.println("Base1");}
}

class Derived1 extends Base1{
	public Derived1(){System.out.println("Derived1");}
}

class Derived2 extends Derived1{
	public Derived2(){System.out.println("Derived2");}
}

public class E04_ConstructorOrder {
	public static void main(String[] args) {
		new Derived2();
	}
}
