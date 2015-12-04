package testjavaclass;

import java.math.BigDecimal;

/**
 *  TestShuzi.java
 *  Description:
 *  
 *  CreateDate: 2015年7月8日 上午10:58:11 
 * 
 *  @author 马宁波
 */
public class TestShuzi {

	public static void main(String[] args) {
//		System.out.println(String.valueOf(2.4286*100)+"%");
//		System.out.println(String.valueOf(2.4286*100)+"%");
		System.out.println(2.4283*100);
		System.out.println(2.4284*100);
		System.out.println(2.4285*100);
		System.out.println(2.4286*100);
		System.out.println(2.4287*100);
		System.out.println(2.4288*100);
		BigDecimal num3 = new BigDecimal(2.4286).multiply(new BigDecimal(100D));
		System.out.println(num3.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue());
	}
}
