package testjavaclass.string;
/**
 *  TestReplace.java
 *  Description:
 *  
 *  CreateDate: 2015年11月5日 下午4:48:13 
 * 
 *  @author 马宁波
 */
public class TestReplace {
	public static void main(String[] args) {
		String s = "ddd\nkkk";
		s = s.replaceAll("\\n", "<br>");
		System.out.println(s);
	}
}
