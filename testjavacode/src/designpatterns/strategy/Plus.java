package designpatterns.strategy;
/**
 *  Plus.java
 *  Description:
 *  
 *  CreateDate: 2015年9月28日 上午11:37:48 
 * 
 *  @author 马宁波
 */
public class Plus extends AbstractCalculator implements ICalculator{

	@Override
	public int calculator(String exp) {
		int[] arrayint = split(exp, "\\+");
		return arrayint[0]+arrayint[1];
	}
	
}
