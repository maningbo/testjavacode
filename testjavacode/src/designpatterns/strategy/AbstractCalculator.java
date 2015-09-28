package designpatterns.strategy;
/**
 *  AbstractCalculator.java
 *  Description:
 *  
 *  CreateDate: 2015年9月28日 上午11:17:48 
 * 
 *  @author 马宁波
 */
public abstract class AbstractCalculator {
	public int[] split(String exp,String opt){
		String[] array= exp.split(opt);
		int[] arrayint = new int[2];
		arrayint[0] = Integer.parseInt(array[0]);
		arrayint[1] = Integer.parseInt(array[1]);
		return arrayint;
	}
}
