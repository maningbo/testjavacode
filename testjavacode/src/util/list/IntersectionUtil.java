package util.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *  IntersectionUtil.java<br>
 *  Description:<br>
 *  <br>
 *  CreateDate: 2016年3月23日 上午10:43:05
 *  @author 马宁波
 */
public class IntersectionUtil {
	public static void main(String[] args) {//将两个List中交集的部分去掉
		List<Integer> list1 = new ArrayList<Integer>();//旧的List
		list1.add(1);list1.add(2);list1.add(3);list1.add(4);list1.add(5);
		List<Integer> list2 = new ArrayList<Integer>();//新的List
		list2.add(3);list2.add(4);list2.add(5);list2.add(6);list2.add(7);
		
		Iterator<Integer> list1it = list1.iterator();
		while (list1it.hasNext()) {
			Integer list1element = list1it.next();
			Iterator<Integer> list2it = list2.iterator();
			while (list2it.hasNext()) {
				if(list1element==list2it.next()){
					list1it.remove();
					list2it.remove();
				}
			}
		}
		System.out.println(list1.toString());//被删除的
		System.out.println(list2.toString());//新增的
	}
}
