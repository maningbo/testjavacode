package designpatterns.mediator;
/**
 *  MyMediator.java
 *  Description:
 *  
 *  CreateDate: 2015年9月30日 上午9:25:34 
 * 
 *  @author 马宁波
 */
public class MyMediator implements Mediator{
	private User1 user1;
	private User2 user2;
	
	public User1 getUser1() {
		return user1;
	}

	public User2 getUser2() {
		return user2;
	}

	@Override
	public void createMediator() {
		user1 = new User1(this);
		user2 = new User2(this);
	}

	@Override
	public void workAll() {
		user1.work();
		user2.work();
	}

}
