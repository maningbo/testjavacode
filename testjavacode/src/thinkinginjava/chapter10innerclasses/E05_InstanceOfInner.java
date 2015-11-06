package thinkinginjava.chapter10innerclasses;
/**
 *  E05_InstanceOfInner.java
 *  Description:
 *  
 *  CreateDate: 2015年11月2日 上午8:50:08 
 * 
 *  @author 马宁波
 */

class Outer3{
	class Inner{
		{System.out.println("Inner created");}
	}
}

public class E05_InstanceOfInner {
	public static void main(String[] args) {
		Outer3 o = new Outer3();
		Outer3.Inner i = o.new Inner();
	}
}
