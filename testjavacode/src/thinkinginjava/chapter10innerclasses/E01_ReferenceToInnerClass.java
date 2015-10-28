package thinkinginjava.chapter10innerclasses;
/**
 *  E01_ReferenceToInnerClass.java
 *  Description:
 *  
 *  CreateDate: 2015年10月26日 上午8:29:19 
 * 
 *  @author 马宁波
 */

class Outer{
	class Inner{
		{System.out.println("Inner created");}
	}
	Inner getInner(){
		return new Inner();
	}
}

public class E01_ReferenceToInnerClass {
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.getInner();
	}
}
