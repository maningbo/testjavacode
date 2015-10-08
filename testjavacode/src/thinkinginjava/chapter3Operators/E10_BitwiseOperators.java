package thinkinginjava.chapter3Operators;
/**
 *  E10_BitwiseOperators.java
 *  Description:
 *  
 *  CreateDate: 2015年10月8日 下午5:35:20 
 * 
 *  @author 马宁波
 */
public class E10_BitwiseOperators {
	public static void main(String[] args) {
		int i1 = 0xaaaaaaaa;
		int i2 = 0x55555555;
		System.out.println(" i1="+Integer.toBinaryString(i1));
		System.out.println("~i1="+Integer.toBinaryString(~i1));
		System.out.println(" i2="+Integer.toBinaryString(i2));
		System.out.println("~i2="+Integer.toBinaryString(~i2));
		System.out.println("i1&i1="+Integer.toBinaryString(i1&i1));
		System.out.println("i1|i1="+Integer.toBinaryString(i1|i1));
		System.out.println("i1^i1="+Integer.toBinaryString(i1^i1));
		System.out.println("i1&i2="+Integer.toBinaryString(i1&i2));
		System.out.println("i1|i2="+Integer.toBinaryString(i1|i2));
		System.out.println("i1^i2="+Integer.toBinaryString(i1^i2));
	}
}
