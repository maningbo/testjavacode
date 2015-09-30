package designpatterns.interpreter;
/**
 *  Plus.java
 *  Description:
 *  
 *  CreateDate: 2015年9月30日 上午9:45:37 
 * 
 *  @author 马宁波
 */
public class Plus implements Expression {

	@Override
	public int interpret(Context context) {
		return context.getNum1()+context.getNum2();
	}

}
