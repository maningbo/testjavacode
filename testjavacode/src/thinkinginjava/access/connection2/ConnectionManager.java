package thinkinginjava.access.connection2;
/**
 *  ConnectionManager.java
 *  Description:
 *  
 *  CreateDate: 2015年10月13日 上午10:50:04 
 * 
 *  @author 马宁波
 */
public class ConnectionManager {
	private static Connection[] pool = new Connection[10];
	static{
		for (int i = 0; i < pool.length; i++) {
			pool[i] = new Connection();
		}
	}
	//Produce the first available connection.
	public static Connection getConnection(){
		for (int i = 0; i < pool.length; i++) {
			if(pool[i]!=null){
				Connection c = pool[i];
				pool[i] = null;//Indicates "in use"
				return c;
			}
		}
		return null;//None left
	}
	public static void checkIn(Connection c){
		for (int i = 0; i < pool.length; i++) {
			if(pool[i]==null){
				pool[i] = c;//check it back in
				return;
			}
		}
	}
}
