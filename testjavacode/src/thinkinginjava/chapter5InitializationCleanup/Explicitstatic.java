package thinkinginjava.chapter5InitializationCleanup;
/**
 *  Explicitstatic.java
 *  Description:
 *  
 *  CreateDate: 2015年10月10日 下午5:10:40 
 * 
 *  @author 马宁波
 */

class Cup{
	Cup(int marker){
		System.out.println("Cup("+marker+")");
	}
	void f(int marker){
		System.out.println("f("+marker+")");
	}
}

class Cups{
	static String s1;
	static String s2 = "s2";
	static Cup cup2 = new Cup(3);
	static{
		s1 = "s1";
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}
	{
		cup1 = new Cup(5);
		cup2 = new Cup(6);
	}
	static Cup cup1 = new Cup(4);
	Cups(){
		System.out.println("Cups()");
	}
	static void printstaticString(){
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
	}
}

public class Explicitstatic {
	public static void main(String[] args) {
		System.out.println("Inside main()");
//		Cups.cup1.f(99);//(1)
//		Cups.printstaticString();
	}
	static Cups cups1 = new Cups();//(2)
//	static Cups cups2 = new Cups();//(2)
}
