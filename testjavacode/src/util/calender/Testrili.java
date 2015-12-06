package util.calender;
/**
 *  Testrili.java
 *  Description:
 *  
 *  CreateDate: 2015年7月21日 上午11:03:24 
 * 
 *  @author 马宁波
 */
public class Testrili {

	public static void main(String[] args) {
		System.out.println(Integer.parseInt("11000000000", 2));//1536
		System.out.println((Integer.parseInt("11000000001", 2)&Integer.parseInt("111111111", 2)));//1
		System.out.println((Integer.parseInt("10", 2)^Integer.parseInt("10", 2)));//0
		System.out.println((Integer.parseInt("10", 2)|Integer.parseInt("10", 2)));//2
		//2的二进制=0000 0010 取反=1111 1101    3的二进制=0000 0011 取反=1111 1100 再取补=1111 1101 所以 ~2=-3
		//负数的二进制换算是先取反 在+1
		System.out.println(~2);//-3
		System.out.println(~1);//-2
	}
}
