package thinkinginjava.chapter9Interfaces;
import static util.Print.*;
/**
 *  E15_AbstractsAndInterfaces.java
 *  Description:
 *  
 *  CreateDate: 2015年10月19日 下午5:07:36 
 * 
 *  @author 马宁波
 */

abstract class Abstract{
	String s;
	public Abstract(String s){this.s=s;}
	abstract void af();
}
class All2 extends Abstract implements Multiple{
	All2(){super("All2");}
	void af(){p("All2.af");}
	public void h(){p("All2.h");}
	public void f1(){p("All2.f1");}
	public void g1(){p("All2.g1");}
	public void f2(){p("All2.f2");}
	public void g2(){p("All2.g2");}
	public void f3(){p("All2.f3");}
	public void g3(){p("All2.g3");}
}

public class E15_AbstractsAndInterfaces {
	static void takes1(Interface1 i){
		i.f1();
		i.g1();
	}
	static void takes2(Interface2 i){
		i.f2();
		i.g2();
	}
	static void takes3(Interface3 i){
		i.f3();
		i.g3();
	}
	static void takesAll(All2 a){
		a.f1();
		a.g1();
		a.f2();
		a.g2();
		a.f3();
		a.g3();
		a.h();
	}
	static void takesAbstract(Abstract a){
		a.af();
	}
	public static void main(String[] args) {
		All2 a = new All2();
		takes1(a);
		takes2(a);
		takes3(a);
		takesAll(a);
		takesAbstract(a);
	}
}
