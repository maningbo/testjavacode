package designpatterns.decorator;
/**
 *  HumanDecoratorZero.java
 *  Description:
 *  
 *  CreateDate: 2015年9月18日 上午9:58:29 
 * 
 *  @author 马宁波
 */
public class HumanDecoratorZero extends HumanDecorator{
	public HumanDecoratorZero(Human human) {
		super(human);
	}

	public void goHome(){
		System.out.println("进房子。。。");
	}
	
	public void findMap(){
		System.out.println("书房找地图。。。");
	}

	@Override
	public void wearClothes() {
		super.wearClothes();
		goHome();
	}

	@Override
	public void walkToSomewhere() {
		super.walkToSomewhere();
		findMap();
	}
}
