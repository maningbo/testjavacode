package thinkinginjava.chapter3Operators;
/**
 *  E12_UnsignedRightShift.java
 *  Description:
 *  
 *  CreateDate: 2015年10月9日 上午9:05:58 
 * 
 *  @author 马宁波
 */
public class E12_UnsignedRightShift {
	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString(-1));
		int i = -1 << 1;
		System.out.println(i);
		System.out.println(Integer.toBinaryString(i));
		int m = (""+Integer.toBinaryString(i)).length()-1;
		//System.out.println(m);
		for(int j=0;j<m;j++){
			i >>>= 1;System.out.println(Integer.toBinaryString(i));
		}
	}
}
