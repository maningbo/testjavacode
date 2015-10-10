package thinkinginjava.chapter4ControllingExecution;

/**
 * E05_BitwiseOperators.java Description:
 * 
 * CreateDate: 2015年10月10日 上午11:40:55
 * 
 * @author 马宁波
 */
public class E05_BitwiseOperators {
	private static void toBinaryString(int i) {
		char[] buffer = new char[32];
		int bufferPosition = 32;
		do {
			buffer[--bufferPosition] = ((i & 0x01) != 0) ? '1' : '0';
			i >>>= 1;
		} while (i != 0);
		for (int j = bufferPosition; j < 32; j++) {
			System.out.print(buffer[j]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int i1 = 0xaaaaaaaa;
		int i2 = 0x55555555;
		System.out.print("i1=");toBinaryString(i1);
		System.out.print("i2=");toBinaryString(i2);
		System.out.print("~i1 = ");toBinaryString(~i1);
		System.out.print("~i2 = ");toBinaryString(~i2);
		System.out.print("i1 & i1 = ");toBinaryString(i1 & i1);
		System.out.print("i1 | i1 = ");toBinaryString(i1 | i1);
		System.out.print("i1 ^ i1 = ");toBinaryString(i1 ^ i1);
		System.out.print("i1 & i2 = ");toBinaryString(i1 & i2);
		System.out.print("i1 | i2 = ");toBinaryString(i1 | i2);
		System.out.print("i1 ^ i2 = ");toBinaryString(i1 ^ i2);
	}
}
