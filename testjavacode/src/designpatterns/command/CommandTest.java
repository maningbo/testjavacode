package designpatterns.command;
/**
 *  CommandTest.java
 *  Description:
 *  
 *  CreateDate: 2015年9月28日 下午4:54:06 
 * 
 *  @author 马宁波
 */
public class CommandTest {
	/* 命令模式的目的就是达到命令的发出者和执行者之间解耦，实现请求和执行分开，
	 * 熟悉Struts的同学应该知道，Struts其实就是一种将请求和呈现分离的技术，
	 * 其中必然涉及命令模式的思想！*/
	public static void main(String[] args) {
		Invoker invoker = new Invoker(new MyCommand(new Receiver()));
		invoker.action();
	}
}
