package designpatterns.bridge;
/**
 *  Client.java
 *  Description:
 *  
 *  CreateDate: 2015年9月22日 下午4:38:07 
 * 
 *  @author 马宁波
 */
public class Client {
	public static void main(String[] args) {
		Address address = new Home();
		address.person = new Man();
		Action action = new PlayGames();
		action.address = address;
		action.run();
	}
}
