package util.mathformula;

import java.util.Arrays;
import java.util.Random;

/**
 * AverageandStandardDevition.java Description:
 * 计算标准差
 * 参考链接：http://blog.sina.com.cn/s/blog_6c851f01010160g2.html
 * CreateDate: 2016年1月25日 上午11:02:45
 * 
 * @author 马宁波
 */
public class AverageandStandardDevition {
	private int[] array = new int[10];
	private int num = 10;
	private static Random random = new Random(1);
	
	public int getRandomDigit() {
		return (int) (random.nextDouble() * 1000);
	}

	public int[] getTargetDigit() {
		for (int i = 0; i < num; i++) {
			array[i] = getRandomDigit();
			//System.out.println(array[i]);
		}
		return array;
	}

	//获取平均值
	public double getAverage() {
		int sum = 0;
		for (int i = 0; i < num; i++) {
			sum += array[i];
		}
		return (double) (sum / num);
	}

	//获取标准差
	public double getStandardDevition() {
		double sum = 0;
		for (int i = 0; i < num; i++) {
			sum += Math.sqrt((array[i] - getAverage())
					* (array[i] - getAverage()));
		}
		return (sum / (num - 1));
	}
	
	public double getStandardDevitiontest() {
		double sum = 0;
		double avg = getAverage();
		for (int i = 0; i < num; i++) {
			sum += (array[i] - avg)*(array[i] - avg);
		}
		return Math.sqrt((sum/num));
	}

	public static void main(String[] args) {
		AverageandStandardDevition gcs = new AverageandStandardDevition();
		System.out.println(Arrays.toString(gcs.getTargetDigit()));
		System.out
				.println(gcs.getAverage() + "   " + gcs.getStandardDevition()+"    "+gcs.getStandardDevitiontest());
		System.out.println(Math.sqrt(25));
	}
}
