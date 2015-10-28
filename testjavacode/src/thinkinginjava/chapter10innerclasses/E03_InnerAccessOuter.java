package thinkinginjava.chapter10innerclasses;
/**
 *  E03_InnerAccessOuter.java
 *  Description:
 *  
 *  CreateDate: 2015年10月26日 上午9:06:17 
 * 
 *  @author 马宁波
 */

class Outer2{
	private final String data;
	class Inner{
		public String toString(){return data;}
	}
	Outer2(String data){this.data=data;}
	Inner getInner(){return new Inner();}
}

public class E03_InnerAccessOuter {
	public static void main(String[] args) {
		Outer2 o = new Outer2("Inner accessing outer!");
		Outer2.Inner i = o.getInner();
		System.out.println(i.toString());
	}
}
