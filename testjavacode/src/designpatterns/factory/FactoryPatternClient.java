package designpatterns.factory;
/**
 *  FactoryPatternClient.java
 *  Description:
 *  
 *  CreateDate: 2015年9月24日 下午3:51:11 
 * 
 *  @author 马宁波
 */
public class FactoryPatternClient {
	public static void main(String[] args) {
		Factory factory = new SmsFactory();
		Sender sender = factory.produce();
		sender.send();
	}
}
