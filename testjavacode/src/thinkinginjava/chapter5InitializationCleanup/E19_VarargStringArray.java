package thinkinginjava.chapter5InitializationCleanup;
/**
 *  E19_VarargStringArray.java
 *  Description:
 *  
 *  CreateDate: 2015年10月12日 下午2:11:25 
 * 
 *  @author 马宁波
 */
public class E19_VarargStringArray {
	static void printStrings(String... strs){
		for (String string : strs) {
			System.out.println(string);
		}
	}
	public static void main(String[] args) {
		printStrings();
		printStrings("These","are","some","strings");
		printStrings(new String[]{"These","are","some","strings"});
	}
}
