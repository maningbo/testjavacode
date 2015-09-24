package designpatterns.factory;
/**
 *  SmsSender.java
 *  Description:
 *  
 *  CreateDate: 2015年9月24日 下午3:47:14 
 * 
 *  @author 马宁波
 */
public class SmsSender implements Sender {

	@Override
	public void send() {
		System.out.println("发短信。。。");
	}

}
