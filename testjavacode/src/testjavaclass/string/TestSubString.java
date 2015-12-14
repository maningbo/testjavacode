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
		String jsppath = "C:/Users/manin_000/git/feelingware/src/main/webapp/jsp/back/admin.jsp";
		String webrootpath = "C:/Users/manin_000/git/feelingware/src/main/webapp";
		String relativepath = jsppath.substring(jsppath.indexOf(webrootpath)+webrootpath.length());
		System.out.println(relativepath.substring(relativepath.indexOf("jsp")+4, relativepath.lastIndexOf(".")));
	}
}
