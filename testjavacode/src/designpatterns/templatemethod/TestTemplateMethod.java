package designpatterns.templatemethod;
/**
 *  TestTemplateMethod.java
 *  Description:
 *  
 *  CreateDate: 2015年9月28日 下午2:02:17 
 * 
 *  @author 马宁波
 */
public class TestTemplateMethod {
	public static void main(String[] args) {
		AbstractCalculator ac = new Plus();
		System.out.println(ac.calculator(3,4 ));
		System.out.println(ac.calculator("8+8", "\\+"));
		AbstractCalculator ac1 = new Minus();
		System.out.println(ac1.calculator(3,4 ));
		System.out.println(ac1.calculator("8-8", "-"));
		AbstractCalculator ac2 = new Multiply();
		System.out.println(ac2.calculator(3,4 ));
		System.out.println(ac2.calculator("8*8", "\\*"));
	}
}
