package designpatterns.templatemethod;
/**
 *  Plus.java
 *  Description:
 *  
 *  CreateDate: 2015年9月28日 下午1:59:58 
 * 
 *  @author 马宁波
 */
public class Plus extends AbstractCalculator{

	@Override
	public int calculator(int num1, int num2) {
		return num1+num2;
	}

}
