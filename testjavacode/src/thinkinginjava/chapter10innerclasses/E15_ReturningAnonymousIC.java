package thinkinginjava.chapter10innerclasses;
/**
 *  E15_ReturningAnonymousIC.java
 *  Description:
 *  
 *  CreateDate: 2015年11月6日 上午8:25:23 
 * 
 *  @author 马宁波
 */

class NoDefault{
	private int i;
	public NoDefault(int i){this.i = i;}
	public void f(){System.out.println("NoDefault.f");}
}

class Second{
	public NoDefault get1(int i){
		//Doesn't override an methods:
		return new NoDefault(i){};
	}
	public NoDefault get2(int i){
		//Overrides f():
		return new NoDefault(i){
			public void f(){
				System.out.println("Second.get2.f");
			}
		};
	}
}

public class E15_ReturningAnonymousIC {
	//In get1(),you inherit NoDefault in the anonymous inner class
	//without overriding any methods;usually you'll override a method
	//when you inherit,as in get2().
	public static void main(String[] args) {
		Second sec = new Second();
		NoDefault nd = sec.get1(47);
		nd.f();
		nd = sec.get2(99);
		nd.f();
	}
}
