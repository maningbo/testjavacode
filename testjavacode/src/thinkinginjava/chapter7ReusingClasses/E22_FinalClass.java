package thinkinginjava.chapter7ReusingClasses;
/**
 *  E22_FinalClass.java
 *  Description:
 *  
 *  CreateDate: 2015年10月14日 上午9:45:59 
 * 
 *  @author 马宁波
 */

final class FinalClass{//cannot subclass the final class
	public FinalClass(){
		System.out.println("FinalClass Constructor");
	}
}

public class E22_FinalClass// extends FinalClass
{
	public static void main(String[] args) {
		new FinalClass();
	}
}
