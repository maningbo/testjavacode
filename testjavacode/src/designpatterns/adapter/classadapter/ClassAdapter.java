package designpatterns.adapter.classadapter;

import designpatterns.adapter.NewInterface;
import designpatterns.adapter.OriginalClass;

/**
 *  NewClass.java
 *  Description:
 *  
 *  CreateDate: 2015年9月25日 下午4:21:44 
 * 
 *  @author 马宁波
 */
public class ClassAdapter extends OriginalClass implements NewInterface{

	@Override
	public void method2() {
		System.out.println("method2");
	}

}
