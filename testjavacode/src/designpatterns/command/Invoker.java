package designpatterns.command;
/**
 *  Invoker.java
 *  Description:
 *  
 *  CreateDate: 2015年9月28日 下午4:49:06 
 * 
 *  @author 马宁波
 */
public class Invoker {
	private Command command;
	public Invoker(Command command){
		this.command = command;
	}
	public void action(){
		command.exe();
	}
}
