package thinkinginjava.chapter10innerclasses;
/**
 *  E19_InnerInsieInner.java
 *  Description:
 *  
 *  CreateDate: 2015年11月10日 上午8:52:43 
 * 
 *  @author 马宁波
 */
public class E19_InnerInsieInner {
	class Inner1{
		class Inner2{
			void f(){}
		}
		Inner2 makeInner2(){return new Inner2();}
	}
	Inner1 makeInner1(){return new Inner1();}
	static class Nested1{
		static class Nested2{
			void f(){}
		}
		void f(){}
	}
	public static void main(String[] args) {
		new E19_InnerInsieInner.Nested1().f();
		new E19_InnerInsieInner.Nested1.Nested2().f();
		E19_InnerInsieInner x1 = new E19_InnerInsieInner();
		E19_InnerInsieInner.Inner1 x2 = x1.makeInner1();
		E19_InnerInsieInner.Inner1.Inner2 x3 = x2.makeInner2();
		x3.f();
	}
}
