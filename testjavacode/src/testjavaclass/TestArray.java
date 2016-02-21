package testjavaclass;

import java.util.Arrays;

/**
 *  TestArray.java
 *  Description:
 *  
 *  CreateDate: 2015年7月21日 上午9:04:46 
 * 
 *  @author 马宁波
 */
public class TestArray {

	public static void main(String[] str){
		int[] intarray = {2,3,1,2,5,3,};
		int[] intarray1 = {2,3,1,2,5,3,1};
		System.out.println(intarray.length);
		System.out.println(intarray1.length);
		System.out.println(Arrays.toString(intarray));
		int[] intarray2 = new int[8];
		System.arraycopy(intarray1, 1, intarray2, 1, 6);
		System.out.println(Arrays.toString(intarray2));
		
		String a = "2,4,5";
		String b = "2,4,5,";
		System.out.println(Arrays.toString(a.split(",")));
		System.out.println(Arrays.toString(b.split(",")));
		System.out.println(b.split(",").length);
		
		int[] intarray3 = new int[8];
		System.out.println(intarray3.length);
		System.out.println(Arrays.toString("".split(",")));
		System.out.println("".split(",").length);
		System.out.println("".split(",")[0].equals(""));
		System.out.println((new String[]{}).length);
		System.out.println((new String[]{""}).length);
	}
}
