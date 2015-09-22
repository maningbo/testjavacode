package designpatterns.bridge;
/**
 *  Home.java
 *  Description:
 *  
 *  CreateDate: 2015年9月22日 下午4:34:38 
 * 
 *  @author 马宁波
 */
public class Home extends Address{
	
	@Override
	public void run() {
		person.run();
		System.out.println("在家");
	}

}
