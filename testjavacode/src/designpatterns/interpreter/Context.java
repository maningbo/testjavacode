package designpatterns.interpreter;
/**
 *  Context.java
 *  Description:
 *  
 *  CreateDate: 2015年9月30日 上午9:43:11 
 * 
 *  @author 马宁波
 */
public class Context {
	private int num1;
	private int num2;
	public Context(int num1,int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
}
