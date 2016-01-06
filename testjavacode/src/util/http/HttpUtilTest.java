package util.http;

import java.io.UnsupportedEncodingException;

/**
 * HttpUtilTest.java Description:
 * 
 * CreateDate: 2015年11月25日 下午2:32:16
 * 
 * @author 马宁波
 */
public class HttpUtilTest {
	public static void main(String[] args) throws UnsupportedEncodingException {
		// 发送 GET 请求
		String s = HttpRequest.sendGet(
				"http://1212.ip138.com/ic.asp",//http://www.ip138.com,http://www.baidu.com
				"");
		System.out.println(new String(s.getBytes("gb2312"),"utf-8"));//乱码
		String s1 = HttpRequest.sendGet(
				"http://www.baidu.com",//http://www.ip138.com,http://www.baidu.com
				"");
		System.out.println(s1);

		System.out.println("==================================================");
		
		// 发送 POST 请求
//		String sr = HttpRequest.sendPost(
//				"http://172.16.15.110:8080/all/station_flow/diseaseArea",
//				"");
//		System.out.println(sr);
	}
}
