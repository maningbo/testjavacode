package designpatterns.factory;
/**
 *  MailSender.java
 *  Description:
 *  
 *  CreateDate: 2015年9月24日 下午3:48:40 
 * 
 *  @author 马宁波
 */
public class MailSender implements Sender {

	@Override
	public void send() {
		System.out.println("发邮件。。。");
	}

}
