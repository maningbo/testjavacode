package designpatterns.decorator;
/**
 *  HumanDecoratorZero.java
 *  Description:
 *  
 *  CreateDate: 2015年9月18日 上午9:58:29 
 * 
 *  @author 马宁波
 */
public class HumanDecoratorFirst extends HumanDecorator{
	public HumanDecoratorFirst(Human human) {
		super(human);
	}

	public void goClothespress(){
		System.out.println("去衣柜找找看。。。");
	}
	
	public void findPlaceOnMap(){
		System.out.println("在地图上找找。。。");
	}

	@Override
	public void wearClothes() {
		super.wearClothes();
		goClothespress();
	}

	@Override
	public void walkToSomewhere() {
		super.walkToSomewhere();
		findPlaceOnMap();
	}
}
