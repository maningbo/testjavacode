package thinkinginjava.chapter2everythingisobject;
/**
 *  LongLiterals.java
 *  Description:
 *  用二进制打印十六进制和八进制表示的long型数值
 *  CreateDate: 2015年9月21日 上午9:05:32 
 * 
 *  @author 马宁波
 */
public class LongLiterals {
	public static void main(String[] args) {
		long l1 = 0x2f;//Hexdecimal(lowercase)
		System.out.println("l1:"+Long.toBinaryString(l1));
		long l2 = 0x2F;//Hexdecimal(uppercase)
		System.out.println("l2:"+Long.toBinaryString(l2));
		long l3 = 0177;//Octal(leading zero)
		System.out.println("l3:"+Long.toBinaryString(l3));
	}
}
