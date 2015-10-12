package thinkinginjava.chapter5InitializationCleanup;
/**
 *  E18_ObjectArray.java
 *  Description:
 *  
 *  CreateDate: 2015年10月12日 下午2:06:10 
 * 
 *  @author 马宁波
 */
public class E18_ObjectArray {
	public static void main(String[] args) {
		Test[] array = new Test[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = new Test(Integer.toString(i));
		}
	}
}
