package teststructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *  TestTreeMap.java
 *  Description:
 *  
 *  CreateDate: 2015年10月14日 下午5:48:04 
 * 
 *  @author 马宁波
 */
public class TestTreeMap {
	private static final List<String> NAMES = new ArrayList<String>(){{
		add("John");
		add("Tony");
		System.out.println(NAMES);
	}};
	public static void main(String[] args) {
		Map<String,Object> collection = new TreeMap();
		System.out.println(NAMES);
	}
}
