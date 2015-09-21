package thinkinginjava.chapter2everythingisobject;

import java.util.Random;

/**
 *  CoinFlipping.java
 *  Description:
 *  模拟抛硬币
 *  CreateDate: 2015年9月21日 上午8:28:22 
 * 
 *  @author 马宁波
 */
public class CoinFlipping {
	public static void main(String[] args) {
		Random rand = new Random();
		boolean flip = false;
		int i=0,j=0;
		for(int m=0;m<5000;m++){
			flip = rand.nextBoolean();
			if(flip){
				i++;
			}else{
				j++;
			}
			
		}
		System.out.print("OUTCOME: ");
		System.out.println(flip ? "HEAD" : "TAIL");
		System.out.println("HEAD probability："+i/(float)(i+j));
		System.out.println("TAIL probability："+j/(float)(i+j));
	}
}
