package thinkinginjava.chapter9Interfaces;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 *  RandomWords.java
 *  Description:
 *  
 *  CreateDate: 2015年10月16日 下午2:55:23 
 * 
 *  @author 马宁波
 */
public class RandomWords implements Readable{
	private static Random rand = new Random(47);
	private static final char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	private static final char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	private static final char[] vowels = "aeiou".toCharArray();
	private int count;
	public RandomWords(int count){this.count = count;}
	@Override
	public int read(CharBuffer cb) throws IOException {
		if(count-- == 0){
			return -1;
		}
		cb.append(capitals[rand.nextInt(capitals.length)]);
		for (int i = 0; i < 4;i++) {
			cb.append(vowels[rand.nextInt(vowels.length)]);
			cb.append(lowers[rand.nextInt(lowers.length)]);
		}
		cb.append(" ");
		return count;//Number of characters appended
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(new RandomWords(10));
		while (s.hasNext()) {
			System.out.println(s.next());
		}
	}
}
