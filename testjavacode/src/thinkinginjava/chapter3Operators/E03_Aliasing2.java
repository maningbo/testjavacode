package thinkinginjava.chapter3Operators;
/**
 *  E03_Aliasing2.java
 *  Description:
 *  
 *  CreateDate: 2015年10月8日 上午11:11:07 
 * 
 *  @author 马宁波
 */
public class E03_Aliasing2 {
	static void f(Integral y){
		y.f = 1.0f;
	}
	public static void main(String[] args) {
		Integral x = new Integral();
		x.f = 9.0f;
		System.out.println("1: x.f: " + x.f);
		f(x);
		System.out.println("2: x.f: " + x.f);
	}
}
