package util.http;
/**
 *  WebData.java
 *  Description:
 *  
 *  CreateDate: 2016年1月11日 上午10:15:53 
 * 
 *  @author 马宁波
 */
public class WebData {
	public static void main(String[] args) {
		System.out.println(getCurrentNetIp());
	}
	
	/**
	 * 获取当前网络公网ip地址
	 * @return
	 */
	public static String getCurrentNetIp(){
		String s = HttpRequest.sendGet(
				"http://pv.sohu.com/cityjson",//http://www.ip138.com,http://www.baidu.com
				"","GB2312");
		if("".equals(s)){
			return "接口请求失败";
		}
		String substr1 = s.substring("var returnCitySN = {\"cip\": \"".length());
		return substr1.substring(0,substr1.indexOf("\""));
	}
}
