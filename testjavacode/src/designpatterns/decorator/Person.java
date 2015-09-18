package designpatterns.decorator;
/**
 *  Person.java
 *  Description:
 *  定义被装饰者，被装饰者初始状态有些自己的装饰
 *  CreateDate: 2015年9月18日 上午10:17:26 
 * 
 *  @author 马宁波
 */
public class Person implements Human{//定义被装饰者，被装饰者初始状态有些自己的装饰

	@Override
	public void wearClothes() {
		System.out.println("穿什么呢。。。");
	}

	@Override
	public void walkToSomewhere() {
		System.out.println("去哪里呢。。。");
	}

}
