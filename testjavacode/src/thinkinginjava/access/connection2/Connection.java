package thinkinginjava.access.connection2;
/**
 *  Connection.java
 *  Description:
 *  
 *  CreateDate: 2015年10月13日 上午10:46:58 
 * 
 *  @author 马宁波
 */
public class Connection {
	private static int counter = 0;
	private int id = counter++;
	Connection(){}
	public String toString(){
		return "Connection "+id;
	}
	public void doSomething(){}
	public void checkIn(){
		ConnectionManager.checkIn(this);
	}
}
