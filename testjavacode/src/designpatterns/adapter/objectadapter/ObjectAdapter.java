package designpatterns.adapter.objectadapter;

import designpatterns.adapter.NewInterface;
import designpatterns.adapter.OriginalClass;

/**
 *  ObjectAdapter.java
 *  Description:
 *  
 *  CreateDate: 2015年9月25日 下午4:28:36 
 * 
 *  @author 马宁波
 */
public class ObjectAdapter implements NewInterface{
	private OriginalClass oc;
	
	public ObjectAdapter(OriginalClass oc){
		super();
		this.oc = oc;
	}
	
	@Override
	public void method1() {
		oc.method1();
	}

	@Override
	public void method2() {
		System.out.println("method2");
	}
	
}
