package designpatterns.interpreter;
/**
 *  Expression.java
 *  Description:
 *  
 *  CreateDate: 2015年9月30日 上午9:42:15 
 * 
 *  @author 马宁波
 */
public interface Expression {
	public int interpret(Context context);
}
