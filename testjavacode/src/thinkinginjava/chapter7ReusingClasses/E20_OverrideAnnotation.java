package thinkinginjava.chapter7ReusingClasses;
/**
 *  E20_OverrideAnnotation.java
 *  Description:
 *  
 *  CreateDate: 2015年10月14日 上午9:23:37 
 * 
 *  @author 马宁波
 */

class WithFinals{
	//Identical to "private" alone
	private final void f(){
		System.out.println("WithFinals f()");
	}
	//Also automatically "final"
	private void g(){
		System.out.println("WithFinals g()");
	}
}

class OverridingPrivateE20 extends WithFinals{
//	@Override
	private final void f(){
		System.out.println("OverridingPrivateE20.f()");
	}
//	@Override
	private void g(){
		System.out.println("OverridingPrivateE20.g()");
	}
}

class OverridingPrivate2E20 extends OverridingPrivateE20{
//	@Override//父类的private方法对于子类来说不可访问
	public final void f(){
		System.out.println("OverridingPrivate2E20.f()");
	}
//	@Override
	public void g(){
		System.out.println("OverridingPrivate2E20.g()");
	}
}

public class E20_OverrideAnnotation {
	public static void main(String[] args) {
		OverridingPrivate2E20 op2 = new OverridingPrivate2E20();
		op2.f();
		op2.g();
	}
}
