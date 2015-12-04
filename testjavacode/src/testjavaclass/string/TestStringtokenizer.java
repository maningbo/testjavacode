package testjavaclass.string;

import java.util.StringTokenizer;

/**
 *  TestStringtokenizer.java
 *  Description:
 *  
 *  CreateDate: 2015年7月22日 上午8:45:53 
 * 
 *  @author 马宁波
 */
public class TestStringtokenizer {

	public static void main(String[] args) {
		System.out.println("dfsfd".indexOf("d", 1));
		StringTokenizer st = new StringTokenizer("www.ooobj.com", ".b", true);
		System.out.println(st.countTokens());
		while(st.hasMoreElements()){
			System.out.println("Token:" + st.nextToken());
		}
	}
}
