package thinkinginjava.chapter10innerclasses;
/**
 *  E08_OuterAccessingInner.java
 *  Description:
 *  
 *  CreateDate: 2015年11月3日 上午8:42:11 
 * 
 *  @author 马宁波
 */

class Outer4{
	class Inner{
		private int j;
		private void h(){
			System.out.println("Inner.h called");
			System.out.println("Inner.j="+j);
		}
	}
	public void testInnerAccess(){
		Inner i = new Inner();
		i.j = 47;
		i.h();
	}
}

public class E08_OuterAccessingInner {
	//As you can see from the output,the accessibility goes both ways.
	public static void main(String[] args) {
		Outer4 o = new Outer4();
		o.testInnerAccess();
	}
}
