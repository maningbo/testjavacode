package thinkinginjava.chapter7ReusingClasses;
/**
 *  E07_SimpleInheritance2.java
 *  Description:
 *  
 *  CreateDate: 2015年10月13日 下午3:39:04 
 * 
 *  @author 马宁波
 */

class A2{
	public A2(String s){System.out.println("A2():"+s);}
}

class B2{
	public B2(String s){System.out.println("B2():"+s);}
}

class C2 extends A2{
	B2 b;
	public C2(String s){
		//Remember that super calls the base-class 
		//constructor and must be the first call in 
		//a derived-class constructor.
		super(s);//必须要在第一行就调用
		b = new B2(s);
	}
}

public class E07_SimpleInheritance2 {
	public static void main(String[] args) {
		new C2("Init String");
	}
}
