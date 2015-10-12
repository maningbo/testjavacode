package thinkinginjava.chapter5InitializationCleanup;
/**
 *  TestVarargs.java
 *  Description:
 *  可变参数列表的使用
 *  CreateDate: 2015年10月12日 上午9:37:34 
 * 
 *  @author 马宁波
 */
public class TestVarargs {
	static void f(int required,String... trailing){
		System.out.print("required:"+required+" ");
		for (String string : trailing) {
			System.out.print(string+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		f(1,"ddd");
		f(2,"a","b");
		f(0);
	}
}
