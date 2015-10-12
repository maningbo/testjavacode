package thinkinginjava.chapter5InitializationCleanup;
/**
 *  E16_StringArray.java
 *  Description:
 *  
 *  CreateDate: 2015年10月12日 下午1:50:40 
 * 
 *  @author 马宁波
 */
public class E16_StringArray {
	public static void main(String[] args) {
		//Doing it the hard way.
		String sal[] = new String[4];
		sal[0] = "These";
		sal[1] = "are";
		sal[2] = "some";
		sal[3] = "strings";
		for (int i = 0; i < sal.length; i++) {
			System.out.println(sal[i]);
		}
		//make it easier
		//Using aggregate initialization to
		String sal2[] = {"These","are","some","strings"};
		for (int j = 0; j < sal2.length; j++) {
			System.out.println(sal2[j]);
		}
	}
}
