package designpatterns.adapter.objectadapter;

import designpatterns.adapter.OriginalClass;

/**
 *  TestObjectAdapterClient.java
 *  Description:
 *  
 *  CreateDate: 2015年9月25日 下午4:31:54 
 * 
 *  @author 马宁波
 */
public class TestObjectAdapterClient {
	public static void main(String[] args) {
		//当希望将一个对象转换成满足另一个新接口的对象时，可以创建一个Wrapper类，
		//持有原类的一个实例，在Wrapper类的方法中，调用实例的方法就行。
		ObjectAdapter oa = new ObjectAdapter(new OriginalClass());
		oa.method1();
		oa.method2();
	}
}
