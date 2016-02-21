package testjavaclass.string;

import java.util.Arrays;

/**
 *  TestSplit.java
 *  Description:
 *  
 *  CreateDate: 2015年7月2日 上午11:18:17 
 * 
 *  @author 马宁波
 */
public class TestSplit {

	public static void main(String[] args) {
		String s = "baidu a google bing";
		String[] strArr = s.split(" ", -1);
		System.out.println(Arrays.asList(strArr));
		String ss = "";
//		String ss = null;
		System.out.println(ss.isEmpty());
		
		String aaa = "1|药首页,2|疾病找药,3|加入周边药店,4|全国商家,5|商品页,6|说明书页,"
				+ "7|搜索量,8|通用名页,9|我要评价,10|用后评价,11|用前咨询,12|周边药店";
		String[] aaass = aaa.split(",");
		System.out.println(Arrays.asList(aaass));
		for (int i = 0; i < aaass.length; i++) {
			String[] sss = aaass[i].split("\\|");
			System.out.println(Arrays.asList(sss));
			System.out.println(sss[0]);
			System.out.println(sss[1]);
		}
		
		System.out.println("".split(",").length);
		System.out.println("ddd,".split(",").length);
	}
}
