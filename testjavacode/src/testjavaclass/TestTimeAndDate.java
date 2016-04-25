package testjavaclass;

import java.util.Date;

/**
 * TestTimeAndDate.java<br>
 * Description:<br>
 * <br>
 * CreateDate: 2016年4月13日 上午8:46:53
 * 
 * @author 马宁波
 */
public class TestTimeAndDate {
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		System.out.println(new Date().getTime()/1000);//转换为UNIX时间戳
	}
}
