package 日历;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * TestDate.java Description:
 * 
 * CreateDate: 2015年10月22日 下午2:05:04
 * 
 * @author 马宁波
 */
public class TestDate {
	/**
	 * 计算两个日期之间相差的天数,包含起始日期
	 * @param smdate	较小的时间
	 * @param bdate		较大的时间
	 * @return 			相差天数，返回负值表示smdate大于bdate，返回0表示日期格式转换有误
	 * @throws ParseException
	 */
	public static int daysBetween(Date smdate, Date bdate){
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			smdate = sdf.parse(sdf.format(smdate));
			bdate = sdf.parse(sdf.format(bdate));
			Calendar cal = Calendar.getInstance();
			cal.setTime(smdate);
			long time1 = cal.getTimeInMillis();
			cal.setTime(bdate);
			long time2 = cal.getTimeInMillis();
			long between_days = (time2 - time1) / (1000 * 3600 * 24);
			
			if(between_days>=0){
				return Integer.parseInt(String.valueOf(between_days))+1;
			}else{
				return Integer.parseInt(String.valueOf(between_days))-1;
			}
		} catch (ParseException e) {
			e.printStackTrace();
			return 0;
		}
	}

	/**
	 * 计算两个yyyy-MM-dd格式的日期之间的天数,包含起始日期
	 * 返回负值表示smdate大于bdate，返回0表示日期格式转换有误
	 */
	public static int daysBetween(String smdate, String bdate){
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar cal = Calendar.getInstance();
			cal.setTime(sdf.parse(smdate));
			long time1 = cal.getTimeInMillis();
			cal.setTime(sdf.parse(bdate));
			long time2 = cal.getTimeInMillis();
			long between_days = (time2 - time1) / (1000 * 3600 * 24);
			
			if(between_days>=0){
				return Integer.parseInt(String.valueOf(between_days))+1;
			}else{
				return Integer.parseInt(String.valueOf(between_days))-1;
			}
		} catch (ParseException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d1 = sdf.parse("2012-09-08 10:10:10");
		Date d2 = sdf.parse("2012-09-15 00:00:00");
		System.out.println(daysBetween(d1, d2));

		System.out.println(daysBetween("2015-9-29","2015-10-05"));
	}
}
