package testList;

import java.util.ArrayList;
import java.util.Collection;
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
		list.add("1");
		System.out.println(list.contains("1"));
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
		list.subList(1, 3).clear();
		System.out.println(list.toString());
		System.out.println(list.subList(1, 3));
		
		//List To Collection
		List<Manager> managers = new ArrayList<Manager>();
		Manager m1 = new Manager(1, "xiaoming", "ddddd", "小明");
		managers.add(m1);managers.add(m1);
		Collection<Manager> c = managers;
		Iterator<Manager> it =  c.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().getLoginName());
		}
		
		//Collection To List
		List<Manager> managersFromCollection = (List<Manager>) c;
		for (Manager manager : managersFromCollection) {
			System.out.println(manager.getLoginName());
		}
	}
}
