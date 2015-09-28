package designpatterns.templatemethod;
/**
 *  AbstractCalculator.java
 *  Description:
 *  
 *  CreateDate: 2015年9月28日 下午1:50:49 
 * 
 *  @author 马宁波
 */
public abstract class AbstractCalculator {
	/*主方法，实现对本类其它方法的调用*/
	public final int calculator(String exp,String opt){
		int[] arrayint = split(exp, opt);
		return calculator(arrayint[0], arrayint[1]);
	}
	/*被子类重写的方法*/
	abstract public int calculator(int num1,int num2);
	
	public int[] split(String exp,String opt){
		String[] array= exp.split(opt);
		int[] arrayint = new int[2];
		arrayint[0] = Integer.parseInt(array[0]);
		arrayint[1] = Integer.parseInt(array[1]);
		return arrayint;
	}
}
