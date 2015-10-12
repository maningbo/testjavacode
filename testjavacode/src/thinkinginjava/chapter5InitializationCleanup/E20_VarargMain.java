package thinkinginjava.chapter5InitializationCleanup;
/**
 *  E20_VarargMain.java
 *  Description:
 *  
 *  CreateDate: 2015年10月12日 下午2:23:53 
 * 
 *  @author 马宁波
 */
public class E20_VarargMain {
	public static void main(String[] args) {
		args = new String[]{"These","are","some","strings"};
		E19_VarargStringArray.printStrings(args);
	}
}
