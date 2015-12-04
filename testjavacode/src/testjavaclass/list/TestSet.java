package testjavaclass.list;

import java.util.HashSet;
import java.util.Set;

/**
 *  TestSet.java
 *  Description:
 *  
 *  CreateDate: 2015年12月4日 下午1:12:44 
 * 
 *  @author 马宁波
 */
public class TestSet {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("d");
		set.add("d");
		System.out.println(set.toString());
	}
}
