package designpatterns.ChainOfResponsibility;
/**
 *  AbstractHandler.java
 *  Description:
 *  
 *  CreateDate: 2015年9月28日 下午4:09:03 
 * 
 *  @author 马宁波
 */
public abstract class AbstractHandler {
	private Handler handler;

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}
	
}
