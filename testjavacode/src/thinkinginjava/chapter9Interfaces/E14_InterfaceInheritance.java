package thinkinginjava.chapter9Interfaces;
import static util.Print.*;
/**
 *  E14_InterfaceInheritance.java
 *  Description:
 *  
 *  CreateDate: 2015年10月19日 下午4:34:06 
 * 
 *  @author 马宁波
 */

interface Interface1{
	void f1();
	void g1();
}
interface Interface2{
	void f2();
	void g2();
}
interface Interface3{
	void f3();
	void g3();
}
interface Multiple extends Interface1,Interface2,Interface3{
	void h();
}
class Concrete{
	String s;
	public Concrete(String s){
		this.s = s;
	}
}
class All extends Concrete implements Multiple{
	All(){super("All");}
	public void h(){p("All.h");}
	public void f1(){p("All.f1");}
	public void g1(){p("All.g1");}
	public void f2(){p("All.f2");}
	public void g2(){p("All.g2");}
	public void f3(){p("All.f3");}
	public void g3(){p("All.g3");}
}

public class E14_InterfaceInheritance {
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
	static void takesAll(All a){
		a.f1();
		a.g1();
		a.f2();
		a.g2();
		a.f3();
		a.g3();
		a.h();
	}
	public static void main(String[] args) {
		All a = new All();
		takes1(a);
		takes2(a);
		takes3(a);
		takesAll(a);
	}
}
