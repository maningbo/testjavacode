package testLogs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * TestLog4j.java Description:
 * 
 * CreateDate: 2015年7月30日 上午8:30:03
 * 
 * @author 马宁波
 */
public class TestLog4j {
	private static Logger logger = LogManager.getLogger("com.feelingware.log");
//	private static Logger logger = LogManager.getLogger(TestLog4j.class);

	public static void testlogout() {
		System.out.println(logger.getName());
		System.out.println(logger.getLevel());
		System.out.println(logger.getMessageFactory());
		logger.entry();
		for(int i=0;i<100;i++){
			logger.info(i+1);
			logger.info("Hello, World!");
			logger.error("Hello, World!");
		}
		logger.exit();
	}

	public static void main(String[] args) {
		Thread.currentThread().setName("你好");
		testlogout();
	}
}
