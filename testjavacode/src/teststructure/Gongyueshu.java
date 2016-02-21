package teststructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  Gongyueshu.java
 *  Description:
 *  
 *  CreateDate: 2016年1月28日 下午5:16:13 
 * 
 *  @author 马宁波
 */
public class Gongyueshu {
	public static void main(String[] args) {
		System.out.println(Math.round((float)5/3));//四舍五入取整
		int a=63,b=9;
		int c=(a>b?a:b);
		List<Integer> gongyueshu = new ArrayList<Integer>();
		for(int i=2;i<=Math.round((float)c/2);i++){
		    if(a%i==0&&b%i==0){
		        gongyueshu.add(i);
		    }
		}
		System.out.println(Arrays.toString(gongyueshu.toArray()));
	}
}
