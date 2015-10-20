package thinkinginjava.chapter9Interfaces;
/**
 *  E03_Initialization.java
 *  Description:
 *  
 *  CreateDate: 2015年10月16日 下午5:26:28 
 * 
 *  @author 马宁波
 */

abstract class BaseWithPrint{
	public BaseWithPrint(){print();}
	public abstract void print();
}

class DerivedWithPrint extends BaseWithPrint{
	int i = 47;
	public void print(){
		System.out.println("i="+i);
	}
}

public class E03_Initialization {
	public static void main(String[] args) {
		DerivedWithPrint dp = new DerivedWithPrint();
		dp.print();
	}
}
