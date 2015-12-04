package testjavaclass;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 *  TestBigDecimal.java
 *  Description:
 *  
 *  CreateDate: 2015年10月8日 下午3:09:58 
 * 
 *  @author 马宁波
 */
public class TestBigDecimal {
	public static void main(String[] args) {
		System.out.println(1.1/999995555.333);
		BigDecimal bd = new BigDecimal(1.1);
		BigDecimal bd1 = new BigDecimal(999995555.333);
		//除法
		int floatnum = 15;
		System.out.println(bd.divide(bd1,floatnum,BigDecimal.ROUND_UP).doubleValue());//总是在非 0 舍弃小数(即截断)之前增加数字。
		System.out.println(bd.divide(bd1,floatnum,BigDecimal.ROUND_DOWN).doubleValue());//从不在舍弃(即截断)的小数之前增加数字。
		System.out.println(bd.divide(bd1,floatnum,BigDecimal.ROUND_CEILING).doubleValue());//如果 BigDecimal为正，则作 ROUND_UP；如果为负，则作 ROUND_DOWN。
		System.out.println(bd.divide(bd1,floatnum,BigDecimal.ROUND_FLOOR).doubleValue());//如果BigDecimal为正，则作ROUND_DOWN；如果为负，则作ROUND_UP。
		System.out.println(bd.divide(bd1,floatnum,BigDecimal.ROUND_HALF_UP).doubleValue());//若舍弃部分>=0.5，则作 ROUND_UP ；否则，作 ROUND_DOWN 。
		System.out.println(bd.divide(bd1,floatnum,BigDecimal.ROUND_HALF_DOWN).doubleValue());//若舍弃部分>0.5，则作 ROUND_UP；否则，作 ROUND_DOWN 。
		System.out.println(bd.divide(bd1,floatnum,BigDecimal.ROUND_HALF_EVEN).doubleValue());//如果舍弃部分左边的数字为奇数，则作 ROUND_HALF_UP ；如果它为偶数，则作 ROUND_HALF_DOWN 。
		//System.out.println(bd.divide(bd1,floatnum,BigDecimal.ROUND_UNNECESSARY).doubleValue());//该“伪舍入模式”实际是指明所要求的操作必须是精确的，因此不需要舍入操作。
		System.out.println(bd.scale());//小数点右侧还有多少位
		//乘法
		System.out.println(bd.multiply(bd1));
		System.out.println(bd.multiply(bd1, new MathContext(10)));
		System.out.println(bd.multiply(bd1, new MathContext(10,RoundingMode.HALF_UP)));
	}
}
