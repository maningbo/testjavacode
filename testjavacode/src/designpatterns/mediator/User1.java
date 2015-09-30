package designpatterns.mediator;
/**
 *  User1.java
 *  Description:
 *  
 *  CreateDate: 2015年9月30日 上午8:58:34 
 * 
 *  @author 马宁波
 */
public class User1 extends User{

	public User1(Mediator mediator){
		super(mediator);
	}
	
	@Override
	public void work() {
		System.out.println("user1 exe!");
	}

}
