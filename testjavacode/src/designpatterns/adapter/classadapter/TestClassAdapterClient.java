package designpatterns.adapter.classadapter;

import designpatterns.adapter.NewInterface;

/**
 *  TestClassAdapterClient.java
 *  Description:
 *  
 *  CreateDate: 2015年9月25日 下午4:23:01 
 * 
 *  @author 马宁波
 */
public class TestClassAdapterClient {
	public static void main(String[] args) {
		//当希望将一个类转换成满足另一个新接口的类时，可以使用类的适配器模式，创建一个新类，继承原有的类，实现新的接口即可。
		NewInterface ni = new ClassAdapter();
		ni.method1();
		ni.method2();
	}
}
