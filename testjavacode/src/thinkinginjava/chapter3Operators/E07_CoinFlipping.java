package thinkinginjava.chapter3Operators;

import java.util.Random;

/**
 *  E07_CoinFlipping.java
 *  Description:
 *  
 *  CreateDate: 2015年10月8日 下午4:18:52 
 * 
 *  @author 马宁波
 */
public class E07_CoinFlipping {
	public static void main(String[] args) {
		Random rand = new Random();
		boolean flip = rand.nextBoolean();
		System.out.println("OUTCOME:" + (flip?"HEAD":"TAIL"));
	}
}
