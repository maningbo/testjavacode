package designpatterns.proxy;
/**
 *  Source.java
 *  Description:
 *  
 *  CreateDate: 2015年9月25日 下午5:16:48 
 * 
 *  @author 马宁波
 */
public class Source implements Sourceable{

	@Override
	public void method() {
		System.out.println("the original method");
	}

}
