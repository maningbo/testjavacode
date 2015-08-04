package 日历;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *  TestSimpleDateFormat.java
 *  Description:
 *  
 *  CreateDate: 2015年8月4日 下午6:43:36 
 * 
 *  @author 马宁波
 */
public class TestSimpleDateFormat {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(new Date()));
	}
}
