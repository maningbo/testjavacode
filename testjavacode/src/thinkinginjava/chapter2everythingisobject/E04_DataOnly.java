package thinkinginjava.chapter2everythingisobject;
/**
 *  E04_DataOnly.java
 *  Description:
 *  
 *  CreateDate: 2015年10月8日 上午8:49:38 
 * 
 *  @author 马宁波
 */
public class E04_DataOnly {
	int i;
	double d;
	boolean b;
	public static void main(String[] args){
		E04_DataOnly d = new E04_DataOnly();
		d.i = 33;
		d.d = 1.1;
		d.b = false;
		System.out.println("d.i = " + d.i);
		System.out.println("d.d = " + d.d);
		System.out.println("d.b = " + d.b);
	}
}
