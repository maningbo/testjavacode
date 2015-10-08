package thinkinginjava.chapter3Operators;
/**
 *  E02_Aliasing.java
 *  Description:
 *  
 *  CreateDate: 2015年10月8日 上午10:54:29 
 * 
 *  @author 马宁波
 */

class Integral{
	float f;
}

public class E02_Aliasing {
	//You can see the effect of aliasing after n2 is assigned to n1: 
	//they both point to the same object.
	public static void main(String[] args) {
		Integral n1 = new Integral();
		Integral n2 = new Integral();
		n1.f = 9f;
		n2.f = 47f;
		System.out.println("1: n1.f: " + n1.f + ", n2.f: " + n2.f);
		n1 = n2;
		System.out.println("2: n1.f: " + n1.f + ", n2.f: " + n2.f);
		n1.f = 27f;
		System.out.println("3: n1.f: " + n1.f + ", n2.f: " + n2.f);
	}
}
