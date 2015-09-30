package designpatterns.mediator;
/**
 *  User.java
 *  Description:
 *  
 *  CreateDate: 2015年9月30日 上午8:44:20 
 * 
 *  @author 马宁波
 */
public abstract class User {
	private Mediator mediator;

	public Mediator getMediator() {
		return mediator;
	}

	public User(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public abstract void work();
}
