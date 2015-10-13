package thinkinginjava.access.connection;
/**
 *  ConnectionManager.java
 *  Description:
 *  
 *  CreateDate: 2015年10月13日 上午10:20:39 
 * 
 *  @author 马宁波
 */
public class ConnectionManager {
	private static Connection[] pool = new Connection[10];
	private static int counter = 0;
	static{
		System.out.println(pool.length);
		for (int i = 0; i < pool.length; i++) {
			pool[i] = new Connection();
		}
	}
	//Very simple -- just hands out each one once.
	public static Connection getConnection(){
		if(counter < pool.length){
			return pool[counter++];
		}else{
			return null;
		}
	}
}
