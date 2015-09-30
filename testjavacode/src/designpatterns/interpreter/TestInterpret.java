package designpatterns.interpreter;
/**
 *  TestInterpret.java
 *  Description:
 *  
 *  CreateDate: 2015年9月30日 上午9:47:35 
 * 
 *  @author 马宁波
 */
public class TestInterpret {
	/*
	 * 解释器模式是我们暂时的最后一讲，一般主要应用在OOP开发中的编译器的开发中，所以适用面比较窄。
	 * Context类是一个上下文环境类，Plus和Minus分别是用来计算的实现
	 * 解释器模式用来做各种各样的解释器，如正则表达式等的解释器等等！
	 * */
	public static void main(String[] args) {
		//计算9+2-8的值
		System.out.println(new Minus().interpret(new Context(new Plus().interpret(new Context(9,2)), 8)));
	}
}
