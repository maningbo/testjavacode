package thinkinginjava.chapter9Interfaces;
/**
 *  E04_AbstractBase.java
 *  Description:
 *  
 *  CreateDate: 2015年10月16日 下午5:36:45 
 * 
 *  @author 马宁波
 */

abstract class NoMethods{}

class Extended1 extends NoMethods{
	public void f(){
		System.out.println("Extended1.f");
	}
}

abstract class WithMethods{
	abstract public void f();
}

class Extended2 extends WithMethods{
	public void f(){
		System.out.println("Extended2.f");
	}
}

public class E04_AbstractBase {
	public static void test1(NoMethods nm){
		//Must downcast to access f()
		((Extended1)nm).f();
	}
	public static void test2(WithMethods wm){
		//No downcast necessary
		wm.f();
	}
	public static void main(String[] args) {
		NoMethods nm = new Extended1();
		test1(nm);
		WithMethods wm = new Extended2();
		test2(wm);
	}
}
