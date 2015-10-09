package thinkinginjava.chapter3Operators;
/**
 *  E14_CompareStrings.java
 *  Description:
 *  
 *  CreateDate: 2015年10月9日 上午9:44:53 
 * 
 *  @author 马宁波
 */
public class E14_CompareStrings {
	public static void p(String s,boolean b){
		System.out.println(s + ":" + b);
	}
	public static void compare(String lval,String rval){
		System.out.println("lval:"+lval+" rval:"+rval);
		p("lval==rval",lval==rval);
		p("lval!=rval",lval!=rval);
		p("lval.equals(rval)",lval.equals(rval));
	}
	public static void main(String[] args) {
		compare("Hello","Hello");
		//Force creation of separate object:
		String s = new String("Hello");
		compare("Hello",s);
		compare("Hello","Goodbye");
	}
}
