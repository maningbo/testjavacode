package thinkinginjava.chapter9Interfaces;
/**
 *  E13_Diamond.java
 *  Description:
 *  
 *  CreateDate: 2015年10月19日 下午4:15:48 
 * 
 *  @author 马宁波
 */

interface BaseInterface{
	void f();
}
interface IntermediateInterface1 extends BaseInterface{
	void f();
}
interface IntermediateInterface2 extends BaseInterface{
	void f();
}
interface CombinedInterface extends IntermediateInterface1,IntermediateInterface2{
	void f();
}
class CombinedImpl implements CombinedInterface{
	public void f(){
		System.out.println("CombinedImpl.f()");
	}
}

public class E13_Diamond {
	public static void main(String[] args) {
		new CombinedImpl().f();
	}
}
