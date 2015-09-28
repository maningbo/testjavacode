package designpatterns.command;
/**
 *  MyCommand.java
 *  Description:
 *  
 *  CreateDate: 2015年9月28日 下午4:49:42 
 * 
 *  @author 马宁波
 */
public class MyCommand implements Command{
	private Receiver receiver;
	public MyCommand(Receiver receiver){
		this.receiver = receiver;
	}
	@Override
	public void exe() {
		receiver.action();
	}

}
