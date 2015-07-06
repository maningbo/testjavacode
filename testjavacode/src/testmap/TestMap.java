package testmap;

import java.util.HashMap;
import java.util.Map;

/**
 *  TestMap.java
 *  Description:
 *  
 *  CreateDate: 2015年7月6日 上午8:32:35 
 * 
 *  @author 马宁波
 */
public class TestMap {

	public static void main(String[] args) {
		Map<Integer, Integer> SESSION_MAP = new HashMap<Integer, Integer>();
		SESSION_MAP.put(1, 3);
		SESSION_MAP.put(1, 4);
		System.out.println(SESSION_MAP.toString());
	}
}
