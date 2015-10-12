package thinkinginjava.chapter5InitializationCleanup;
/**
 *  E17_ObjectReferences.java
 *  Description:
 *  
 *  CreateDate: 2015年10月12日 下午1:59:14 
 * 
 *  @author 马宁波
 */

class Test{
	Test(String s){
		System.out.println("String constructor:s="+s);
	}
}

public class E17_ObjectReferences {
	//You can define the array as a field in the class
	Test[] array1 = new Test[5];
	public static void main(String[] args) {
		//Or as a temporary inside main.
		Test[] array2 = new Test[5];
	}
}
