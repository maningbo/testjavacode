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
		//策略模式的决定权在用户，系统本身提供不同算法的实现，新增或者删除算法，对各种算法做封装。
		//因此，策略模式多用在算法决策系统中，外部用户只需要决定用哪个算法即可
		ICalculator cal = new Plus();
		System.out.println(cal.calculator("3+5"));
		ICalculator cal2 = new Minus();
		System.out.println(cal2.calculator("3-5"));
		ICalculator cal3 = new Multiply();
		System.out.println(cal3.calculator("3*5"));
	}
}
