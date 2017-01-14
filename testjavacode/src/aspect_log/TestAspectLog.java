package aspect_log;

import com.jcabi.aspects.Loggable;

/**
 *  TestAspectLog.java
 *  Description:
 *  
 *  CreateDate: 2016年9月21日 下午10:45:25
 *  @author 马宁波
 */
public class TestAspectLog {
	@Loggable
	public double power(int x, int p) {
		return Math.pow(x, p);
	}
	public static void main(String[] args) {
		System.out.println(new TestAspectLog().power(10, 2));
	}
}
