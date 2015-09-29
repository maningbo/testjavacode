package designpatterns.state;
/**
 *  State.java
 *  Description:
 *  
 *  CreateDate: 2015年9月29日 上午9:25:17 
 * 
 *  @author 马宁波
 */
public class State {
	private String value;
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public void method1(){
		System.out.println("method1");
	}
	public void method2(){
		System.out.println("method2");
	}
}
