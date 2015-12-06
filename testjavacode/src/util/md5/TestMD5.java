package util.md5;
/**
 *  TestMD5.java
 *  Description:
 *  
 *  CreateDate: 2015年7月20日 下午2:48:05 
 * 
 *  @author 马宁波
 */
public class TestMD5 {

	public static void main(String[] args) {
		System.out.println(MD5Util.encryptByMD5("1", "a").length()+"\n"+MD5Util.encryptByMD5("1", "a"));
		System.out.println(MD5Util.encryptByMD5("1", "b").length()+"\n"+MD5Util.encryptByMD5("1", "b"));
	}
}
