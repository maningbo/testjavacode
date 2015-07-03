package testString;

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
		String s1 = "a b c";
		String s2 = "a b c";
		String s3 = "a b c";
		String[] strArr = s.split(" ", -1);
		System.out.println(Arrays.asList(strArr));
		String ss = null;
		System.out.println(ss.isEmpty());
	}
}
