package testjavaclass.string;

import java.io.UnsupportedEncodingException;

/**
 *  ZhuanMa.java
 *  Description:
 *  
 *  CreateDate: 2015年12月17日 上午11:09:25 
 * 
 *  @author 马宁波
 */
public class ZhuanMa {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "2015-12-04-模板.docx";
		System.out.println(new String(s.getBytes("UTF-8"),"ISO-8859-1"));
		System.out.println(new String(s.getBytes("GBK"),"ISO-8859-1"));
	}
}
