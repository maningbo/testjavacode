package testjavaclass.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *  TestArray.java<br>
 *  Description:<br>
 *  测试同时涉及随机访问与删除操作时ArrayList与LinkedList的效率<br>
 *  1.ArrayList是实现了基于动态数组的数据结构，LinkedList基于链表的数据结构。<br>
 *  2.对于随机访问get和set，ArrayList觉得优于LinkedList，因为LinkedList要移动指针。 <br>
 *  3.对于新增和删除操作add和remove，LinedList比较占优势，因为ArrayList要移动数据。<br>
 *  采用Iterator的方式，发现ArrayList效率大于LinkedList<br>
 *  <br>
 *  CreateDate: 2016年5月3日 上午8:55:08
 *  @author 马宁波
 */
public class TestArrayListAndLinkedList {
	public static void main(String[] args) {
		String[] strArray = {"123","3213","2343","3213","2343","3213","2343","3213","2343","3213","2343","3213","2343","3213","2343","3213","2343"};
		long linkedListTime = 0;
		long arrayListTime = 0;
		long linkedListUsedTime = 0;
		long arrayListUsedTime = 0;
		
		for (int k = 0; k < 100; k++) {//循环多少次
			List<String> linkedList = new LinkedList<String>();
			List<String> arrayList = new ArrayList<String>();
			Collections.addAll(linkedList, strArray);
			Collections.addAll(arrayList, strArray);
			//LinkedList测试开始
			long LinkedListStartTime = System.currentTimeMillis();
			Iterator<String> linkedListIt = linkedList.iterator();
			int i = 0;
			while(linkedListIt.hasNext()){
				linkedListIt.next();
				if(i==5){
					linkedListIt.remove();
				}
				i++;
			}
			linkedListUsedTime = System.currentTimeMillis()-LinkedListStartTime;
			//LinkedList测试结束
			//ArrayList测试开始
			long arrayListStartTime = System.currentTimeMillis();
			Iterator<String> arrayListIt = arrayList.iterator();
			int j = 0;
			while(arrayListIt.hasNext()){
				arrayListIt.next();
				if(j==5){
					arrayListIt.remove();
				}
				j++;
			}
			arrayListUsedTime = System.currentTimeMillis()-arrayListStartTime;
			//ArrayList测试结束
			if(linkedListUsedTime>=arrayListUsedTime){
				arrayListTime++;
			}else{
				linkedListTime++;
			}
		}
		
		System.out.println("LinkedList用时少于ArrayList的次数"+linkedListTime);
		System.out.println("ArrayList用时少于LinkedList的次数"+arrayListTime);
		//发现ArrayList效率比较高
	}
}
