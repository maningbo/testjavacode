package thinkinginjava.chapter10innerclasses;
/**
 *  E21_InterfaceWithNested2.java
 *  Description:
 *  
 *  CreateDate: 2015年11月12日 上午9:37:50 
 * 
 *  @author 马宁波
 */

interface I{
	void f();
	void g();
	class Nested{
		static void call(I impl){
			System.out.println("Calling I.f");
			impl.f();
			System.out.println("Calling I.g()");
			impl.g();
		}
	}
}

public class E21_InterfaceWithNested2 {
	public static void main(String[] args) {
		I impl = new I() {
			public void f() {System.out.println("bbb");}
			public void g() {System.out.println("aaa");}
		};
		I.Nested.call(impl);
	}
}
