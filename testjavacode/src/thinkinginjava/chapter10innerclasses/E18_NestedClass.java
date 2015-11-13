package thinkinginjava.chapter10innerclasses;

import thinkinginjava.chapter10innerclasses.E18_NestedClass.Nested;

/**
 *  E18_NestedClass.java
 *  Description:
 *  
 *  CreateDate: 2015年11月9日 上午8:46:54 
 * 
 *  @author 马宁波
 */
public class E18_NestedClass {
	static class Nested{
		void f(){System.out.println("Nested.f");}
	}
	public static void main(String args[]){
		Nested ne = new Nested();
		ne.f();
		Other o = new Other();
		o.f();
	}
}

class Other{
	//Specifying the nested type outside
	//the scope of the class:
	//E18_NestedClass.Nested与Nested均可以
	void f(){
		Nested ne = new Nested();
		ne.f();
	}
}