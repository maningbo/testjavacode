package thinkinginjava.chapter6AccessControl;

import thinkinginjava.access.connection2.Connection;
import thinkinginjava.access.connection2.ConnectionManager;

/**
 *  E08_ConnectionManager2.java
 *  Description:
 *  
 *  CreateDate: 2015年10月13日 上午10:56:43 
 * 
 *  @author 马宁波
 */
public class E08_ConnectionManager2 {
	public static void main(String[] args) {
		Connection[] ca = new Connection[10];
		//Use up all the connection
		for (int i = 0; i < 10; i++) {
			ca[i] = ConnectionManager.getConnection();
		}
		//Should produce "null" since there are no
		//more connections
		System.out.println(ConnectionManager.getConnection());
		//Return connections,then get them out.
		for(int i=0;i<5;i++){
			ca[i].checkIn();
			Connection c = ConnectionManager.getConnection();
			System.out.println(c);
			c.doSomething();
			c.checkIn();
		}
	}
	
}
