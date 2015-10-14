package thinkinginjava.chapter7ReusingClasses;
/**
 *  E21_FinalMethod.java
 *  Description:
 *  
 *  CreateDate: 2015年10月14日 上午9:41:52 
 * 
 *  @author 马宁波
 */

class WithFinalMethod{
	final void f(){
		System.out.println("WithFinalMethod.f()");
	}
}

public class E21_FinalMethod extends WithFinalMethod{
//	void f(){//Cannot override the final method from WithFinalMethod
//		
//	}
	public static void main(String[] args) {
		new E21_FinalMethod().f();
	}
}
