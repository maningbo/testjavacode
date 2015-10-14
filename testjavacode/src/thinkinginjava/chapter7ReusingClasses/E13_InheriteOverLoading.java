package thinkinginjava.chapter7ReusingClasses;
/**
 *  E13_InheriteOverLoading.java
 *  Description:
 *  
 *  CreateDate: 2015年10月13日 下午4:52:29 
 * 
 *  @author 马宁波
 */
class ThreeOverloads{
	public void f(int i){
		System.out.println("f(int i)");
	}
	public void f(char i){
		System.out.println("f(char i)");
	}
	public void f(double i){
		System.out.println("f(double i)");
	}
}

class MoreOverloads extends ThreeOverloads{
	public void f(String s){
		System.out.println("f(String s)");
	}
}

public class E13_InheriteOverLoading {
	public static void main(String[] args) {
		MoreOverloads mo = new MoreOverloads();
		mo.f(1);
		mo.f('a');
		mo.f(1.1);
		mo.f("hello");
	}
}
