package testList;

import java.util.Iterator;
import java.util.Vector;

/**
 * TestVector.java Description:
 * ArrayList会比Vector快，但它是非同步的，如果设计涉及到多线程，还是用Vector比较好一些
 * 演示Vector的使用。包括Vector的创建、向Vector中添加元素、从Vector中删除元素、
 * 统计Vector中元素的个数和遍历Vector中的元素。 CreateDate: 2015年9月18日 下午5:19:56
 * 
 * @author 马宁波
 */
public class TestVector {
	public static void main(String[] args) {

		// Vector的创建
		// 使用Vector的构造方法进行创建
		Vector<String> v = new Vector<String>(4);

		// 向Vector中添加元素
		// 使用add方法直接添加元素
		v.add("Test0");
		v.add("Test1");
		v.add("Test0");
		v.add("Test2");
		v.add("Test2");
		v.add("Test0");
		v.add("Test1");

		// 从Vector中删除元素
		v.remove("Test0"); // 删除指定内容的元素
		v.remove(0); // 按照索引号删除元素

		// 获得Vector中已有元素的个数
		int size = v.size();
		System.out.println("size:" + size);

		// 遍历Vector中的元素
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
		System.out.println("+++++++++++++++++++++++++");
		Iterator<String> it = v.iterator();
		String temp = "";
		while(it.hasNext()){
			temp = it.next();
			System.out.println(temp);
			if("Test0".equals(temp)){
				it.remove();//删除当前元素
			}
		}
		System.out.println(v.size());
	}
}
