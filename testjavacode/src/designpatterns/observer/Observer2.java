package designpatterns.observer;
/**
 *  Observer1.java
 *  Description:
 *  
 *  CreateDate: 2015年9月28日 下午2:24:39 
 * 
 *  @author 马宁波
 */
public class Observer2 implements Observer{

	@Override
	public void update() {
		System.out.println("Observer2 has received!");
	}

}
