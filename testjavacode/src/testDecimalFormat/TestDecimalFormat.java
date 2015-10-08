package testDecimalFormat;

import java.text.DecimalFormat;

/**
 *  TestDecimalFormat.java
 *  Description:
 *  
 *  CreateDate: 2015年7月17日 上午9:49:19 
 * 
 *  @author 马宁波
 */
public class TestDecimalFormat {

	public static void main(String[] args) {
		/**
		 * 	0 一个数字 

			# 一个数字，不包括 0 
			
			. 小数的分隔符的占位符 
			
			, 分组分隔符的占位符 
			
			; 分隔格式。 
			
			- 缺省负数前缀。 
			
			% 乘以 100 和作为百分比显示 
			
			? 乘以 1000 和作为千进制货币符显示；用货币符号代替；如果双写，用 
			
			国际货币符号代替。如果出现在一个模式中，用货币十进制分隔符代 
			
			替十进制分隔符。 
			
			X 前缀或后缀中使用的任何其它字符，用来引用前缀或后缀中的特殊字符。
		 */
		DecimalFormat df1 = new DecimalFormat("0.0");
		DecimalFormat df2 = new DecimalFormat("#.#");
		DecimalFormat df3 = new DecimalFormat("000.000￥");
		DecimalFormat df4 = new DecimalFormat("###.###$");
		DecimalFormat df5 = new DecimalFormat("0.0%");
		DecimalFormat df6 = new DecimalFormat("0.#%");
		System.out.println(df1.format(12.34));
		System.out.println(df2.format(12.34));
		System.out.println(df3.format(12.34));
		System.out.println(df4.format(12.34));
		System.out.println(df5.format(0.53));
		System.out.println(df6.format(0.53));
	}
}
