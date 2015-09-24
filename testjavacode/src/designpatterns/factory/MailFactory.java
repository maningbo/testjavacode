package designpatterns.factory;
/**
 *  MailFactory.java
 *  Description:
 *  
 *  CreateDate: 2015年9月24日 下午3:49:36 
 * 
 *  @author 马宁波
 */
public class MailFactory implements Factory {

	@Override
	public Sender produce() {
		return new MailSender();
	}

}
