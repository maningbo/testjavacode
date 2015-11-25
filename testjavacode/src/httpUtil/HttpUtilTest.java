package httpUtil;

/**
 * HttpUtilTest.java Description:
 * 
 * CreateDate: 2015年11月25日 下午2:32:16
 * 
 * @author 马宁波
 */
public class HttpUtilTest {
	public static void main(String[] args) {
		// 发送 GET 请求
		String s = HttpRequest.sendGet(
				"http://www.baidu.com",
				"");
		System.out.println(s);

		System.out.println("==================================================");
		
		// 发送 POST 请求
		String sr = HttpRequest.sendPost(
				"http://172.16.15.110:8080/all/station_flow/diseaseArea",
				"");
		System.out.println(sr);
	}
}
