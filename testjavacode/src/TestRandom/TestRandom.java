package TestRandom;

import java.util.Random;
import java.util.UUID;

/**
 *  TestRandom.java
 *  Description:
 *  
 *  CreateDate: 2015年9月16日 下午1:27:54 
 * 
 *  @author 马宁波
 */
public class TestRandom {
	public static void main(String[] args) {
		Random random = new Random(100);
		System.out.println(random.getClass());
		for (int i = 0; i < 5; i++) {
			System.out.println(random.nextInt(100));
		}
		random.nextInt();
		for (int i = 0; i < 5; i++) {
			System.out.println(UUID.randomUUID().toString().toUpperCase());
		}
	}
}
