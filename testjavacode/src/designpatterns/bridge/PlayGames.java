package designpatterns.bridge;
/**
 *  PlayGames.java
 *  Description:
 *  
 *  CreateDate: 2015年9月22日 下午4:42:15 
 * 
 *  @author 马宁波
 */
public class PlayGames extends Action{

	@Override
	public void run() {
		address.run();
		System.out.println("玩游戏");
	}

}
