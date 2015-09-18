package designmode.decorator;
/**
 *  HumanDecorator.java
 *  Description:
 *  定义装饰者
 *  CreateDate: 2015年9月18日 上午9:43:01 
 * 
 *  @author 马宁波
 */
public abstract class HumanDecorator implements Human{//定义装饰者
	private Human human;
	
	public HumanDecorator(Human human){
		this.human = human;
	}
	
	@Override
	public void wearClothes() {
		human.wearClothes();
	}
	
	@Override
	public void walkToSomewhere() {
		human.walkToSomewhere();
	}
}
