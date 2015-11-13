package thinkinginjava.chapter10innerclasses;
/**
 *  E20_InterfaceWithNested.java
 *  Description:
 *  
 *  CreateDate: 2015年11月12日 上午8:40:25 
 * 
 *  @author 马宁波
 */

interface WithNested{
	class Nested{
		int i;
		public Nested(int i){this.i = i;}
		void f(){System.out.println("Nested.f"+i);}
	}
}

class B2 implements WithNested{}

public class E20_InterfaceWithNested {
	public static void main(String[] args) {
		B2 b = new B2();
		WithNested.Nested ne = new WithNested.Nested(5);
		ne.f();
	}
}
