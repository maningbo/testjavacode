package testList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *  TestList.java
 *  Description:
 *  
 *  CreateDate: 2015年7月24日 上午9:51:26 
 * 
 *  @author 马宁波
 */
public class TestList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		list.add("7");
		System.out.println(list.size());
		System.out.println(list.toString());
		Collections.reverse(list);
		System.out.println(list.toString());
		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			if(string.equals("5")){
				iterator.remove();
			}
		}
		System.out.println(list.toString());
	}
}
