package designpatterns.factory;
/**
 *  SmsFactory.java
 *  Description:
 *  
 *  CreateDate: 2015年9月24日 下午3:50:22 
 * 
 *  @author 马宁波
 */
public class SmsFactory implements Factory {

	@Override
	public Sender produce() {
		return new SmsSender();
	}

}
