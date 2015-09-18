package designpatterns.decorator;
/**
 *  HumanDecoratorZero.java
 *  Description:
 *  
 *  CreateDate: 2015年9月18日 上午9:58:29 
 * 
 *  @author 马宁波
 */
public class HumanDecoratorTwo extends HumanDecorator{
	public HumanDecoratorTwo(Human human) {
		super(human);
	}

	public void findClothes(){
		System.out.println("找到一件D&G。。。");
	}
	
	public void findTheTarget(){
		System.out.println("在地图上找到神秘花园和城堡。。。");
	}

	@Override
	public void wearClothes() {
		super.wearClothes();
		findClothes();
	}

	@Override
	public void walkToSomewhere() {
		super.walkToSomewhere();
		findTheTarget();
	}
}
