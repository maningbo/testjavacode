package thinkinginjava.chapter6AccessControl;

import thinkinginjava.access.connection.Connection;
import thinkinginjava.access.connection.ConnectionManager;

/**
 *  E08_ConnectionManager.java
 *  Description:
 *  
 *  CreateDate: 2015年10月13日 上午10:26:20 
 * 
 *  @author 马宁波
 */
public class E08_ConnectionManager {
	public static void main(String[] args) {
		Connection c = ConnectionManager.getConnection();
		while(c!=null){
			System.out.println(c);
			c.doSomething();
			c = ConnectionManager.getConnection();
		}
	}
}
