package thinkinginjava.chapter7ReusingClasses;
/**
 *  E19_BlankFinalField.java
 *  Description:
 *  
 *  CreateDate: 2015年10月14日 上午9:07:53 
 * 
 *  @author 马宁波
 */

class WithBlankFinalField{
	private final Integer i;
	//Without this constructor.you'll get a compiler error.
	//"variable i might not have been initialized"
	public WithBlankFinalField(int i1){
		i = new Integer(i1);
	}
	public Integer geti(){
		//This won't compile.The error is:
		//"cannot assign a value to final variable i"
//		if(i==null){
//			i = new Integer(45);
//		}
		return i;
	}
}

public class E19_BlankFinalField {
	public static void main(String[] args) {
		WithBlankFinalField wbff = new WithBlankFinalField(10);
		System.out.println(wbff.geti());
	}
}
