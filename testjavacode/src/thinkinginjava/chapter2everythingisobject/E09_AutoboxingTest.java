package thinkinginjava.chapter2everythingisobject;
/**
 *  E09_AutoboxingTest.java
 *  Description:
 *  
 *  CreateDate: 2015年10月8日 上午9:28:08 
 * 
 *  @author 马宁波
 */
public class E09_AutoboxingTest {
	public static void main(String[] args){
		Byte by = 1;
		byte bt = by;
		System.out.println("byte = " + bt);
		Short sh = 1;
		short s = sh;
		System.out.println("short = " + s);
		Integer in = 1;
		int i = in;
		System.out.println("int = " + i);
		Long lo = 1L;
		long l = lo;
		System.out.println("long = " + l);
		Boolean bo = true;
		boolean b = bo;
		Character ch = 'x';
		char c = ch;
		System.out.println("char = " + c);
		Float f1 = 1.0f;
		float f = f1;
		System.out.println("float = " + f);
		Double db = 1.5d;
		double d = db;
		System.out.println("double = " + d);
	}
}
