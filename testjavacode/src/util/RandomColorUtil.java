package util;

/**
 * RandomColorUtil.java<br>
 * Description:<br>
 * <br>参考链接：http://bbs.csdn.net/topics/90479765
 * CreateDate: 2016年3月30日 下午4:12:08
 * @author 马宁波
 */
public class RandomColorUtil {
	private static String buLing(String s){
		if(s.length()==1){
			return "0"+s;
		}else{
			return s;
		}
	}
	
	public static void main(String[] args) {
		int n = 256 / 2; // 这里的number就是你想要的颜色总数
		for (int r = 0; r < 256; r += n)
			for (int g = 0; g < 256; g += n)
				for (int b = 0; b < 256; b += n) {
					// z这里就是r,g,b的值构造颜色
					System.out.println(r+" "+g+" "+b);
					System.out.println("#"
							+buLing(Integer.toHexString(r))
							+buLing(Integer.toHexString(g))
							+buLing(Integer.toHexString(b))
						);
				}
	}
}
