package designpatterns.strategy;
/**
 *  StrategyTest.java
 *  Description:
 *  
 *  CreateDate: 2015年9月28日 上午11:42:14 
 * 
 *  @author 马宁波
 */
public class StrategyTest {
	public static void main(String[] args) {
		ICalculator cal = new Plus();
		System.out.println(cal.calculator("3+5"));
		ICalculator cal2 = new Minus();
		System.out.println(cal2.calculator("3-5"));
		ICalculator cal3 = new Multiply();
		System.out.println(cal3.calculator("3*5"));
	}
}
