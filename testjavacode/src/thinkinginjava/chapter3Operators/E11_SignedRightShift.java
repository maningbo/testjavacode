package thinkinginjava.chapter3Operators;
/**
 *  E11_SignedRightShift.java
 *  Description:
 *  
 *  CreateDate: 2015年10月8日 下午5:51:06 
 * 
 *  @author 马宁波
 */
public class E11_SignedRightShift {
	public static void main(String[] args) {
		int i = 0x80000000;
		System.out.println(Integer.toBinaryString(i));
		int m = (Integer.toBinaryString(i)+"").length()-1;
		//System.out.println(m);
		for(int j=0;j<m;j++){
			i>>=1;System.out.println(Integer.toBinaryString(i));
		}
	}
}
