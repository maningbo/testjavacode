package designpatterns.decorator;
/**
 *  TestDecoratorDesignMode.java
 *  Description:
 *  
 *  CreateDate: 2015年9月18日 上午10:21:03 
 * 
 *  @author 马宁波
 */
public class TestDecoratorDesignMode {
	public static void main(String[] args){
		Human human = new Person();
		HumanDecorator hd = new HumanDecoratorTwo(new HumanDecoratorFirst(new HumanDecoratorZero(human)));
		hd.wearClothes();
		hd.walkToSomewhere();
		
		System.out.println("********************************");
		
		HumanDecorator hd2 = new HumanDecoratorTwo(human);
		hd2.wearClothes();
	}
}
