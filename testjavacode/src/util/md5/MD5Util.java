package util.md5;
import java.security.MessageDigest;
/**
 *  JJJ.java
 *  Description:
 *  
 *  CreateDate: 2015年7月20日 下午2:58:51 
 * 
 *  @author 马宁波
 */

public class MD5Util{

	/**
	 * @param s,需要加密的字符串
	 * @param changdu，加密后字符串长度为16还是32，16用a表示，32用b表示
	 * @return
	 */
	public final static String encryptByMD5(String s,String changdu) {
		try {
			//使用MD5创建MessageDigest对象
			MessageDigest mdTemp = MessageDigest.getInstance("MD5");
			byte[] md = mdTemp.digest(s.getBytes());
			int i;
			StringBuffer buf = new StringBuffer("");
			for (int offset = 0; offset < md.length; offset++) {
				i = md[offset];
				if(i<0){
					i+= 256;
				}
				if(i<16){
					buf.append("0");
				}
				buf.append(Integer.toHexString(i));
			}
			if("a".equals(changdu)){
				return buf.toString().substring(8,24);//16位的加密 
			}else if("b".equals(changdu)){
				return buf.toString();//32位的加密 
			}else{
				return "changdu参数输入有误";
			}
		} catch (Exception e){
			return "出现异常";
		}
	}

	//测试
	public static void main(String[] args) {
		System.out.println(Integer.toHexString(10));
		System.out.println("1的MD5加密后长度16：\n"+MD5Util.encryptByMD5("1","a").toUpperCase().equals("A0B923820DCC509A"));
		System.out.println("1的MD5加密后长度32：\n"+MD5Util.encryptByMD5("1","b").toUpperCase().equals("C4CA4238A0B923820DCC509A6F75849B"));
	}
}