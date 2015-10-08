package thinkinginjava.chapter2everythingisobject;
/**
 *  E08_StaticTest.java
 *  Description:
 *  
 *  CreateDate: 2015年10月8日 上午9:13:21 
 * 
 *  @author 马宁波
 */
public class E08_StaticTest {
	static int i = 47;
	public static void main(String[] args){
		E08_StaticTest st1 = new E08_StaticTest();
		E08_StaticTest st2 = new E08_StaticTest();
		System.out.println(st1.i + " == " + st2.i);
		st1.i++;
		System.out.println(st1.i + " == " + st2.i);
	}
}
