package thinkinginjava.chapter7ReusingClasses;
/**
 *  E09_ConstructorOrder2.java
 *  Description:
 *  
 *  CreateDate: 2015年10月13日 下午4:08:31 
 * 
 *  @author 马宁波
 */

class Component1{
	public Component1(){System.out.println("Component1");}
}

class Component2{
	public Component2(){System.out.println("Component2");}
}

class Component3{
	public Component3(){System.out.println("Component3");}
}

class Root{
	Component1 c1 = new Component1();
	Component2 c2 = new Component2();
	Component3 c3 = new Component3();
	public Root(){System.out.println("Root");}
}

class Stem extends Root{
	Component1 c1 = new Component1();
	Component2 c2 = new Component2();
	Component3 c3 = new Component3();
	public Stem(){
//		super();
		System.out.println("Stem");
	}
}

public class E09_ConstructorOrder2 {
	public static void main(String[] args) {
		new Stem();
	}
}
