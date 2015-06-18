package testjackson;
/**
 *  TestOjbect.java
 *  Description:
 *  
 *  CreateDate: 2015年6月17日 上午10:50:16 
 * 
 *  @author 马宁波
 */
public class TestOjbect {

	public static void main(String[] args) throws CloneNotSupportedException {
		User user = new User();
		user.setCid("5");
		User user1 = user.clone();
		User user2 = user;
		user.setCid("4");
		System.out.println(user1.getCid()+":"+user1.hashCode()+":"+user.hashCode());
		System.out.println(user2.getCid()+":"+user2.hashCode()+":"+user.hashCode());
		System.out.println(user1==user2);
		System.out.println(user==user2);
	}
}
