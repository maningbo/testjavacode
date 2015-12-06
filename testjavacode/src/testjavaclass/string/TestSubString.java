package testjavaclass.string;
/**
 *  TestSubString.java
 *  Description:
 *  
 *  CreateDate: 2015年12月6日 下午2:09:28
 *  @author 马宁波
 */
public class TestSubString {
	public static void main(String[] args) {
		String s = "C:/Users/manin_000/git/feelingware/src/main/webapp/jsp/back/admin.jsp";
		System.out.println(s.substring(s.indexOf("jsp")+4, s.lastIndexOf(".")));
	}
}
