package testjavaclass.random;

import java.util.Random;

/**
 * RandomBetween.java Description:
 * 
 * CreateDate: 2015年9月29日 下午4:34:14
 * 
 * @author 马宁波
 */
public class RandomBetween {
	/**
	 * 生成指定范围随机数，包含边界值
	 * 返回888888表示设置的min比max大
	 * @param min
	 * @param max
	 * @return
	 */
	public static int getIntRandomFrom(int min, int max) {
		if (min > max) {
			return 888888;
		} else {
			Random random = new Random();
			int s = random.nextInt(max) % (max - min + 1) + min;
			return s;
		}
	}

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		for(int i=0;i<10;i++){
			int temp = getIntRandomFrom(2, 3);
			if(temp==2){
				a++;
			}else{
				b++;
			}
			System.out.println(temp);
		}
		System.out.println("2/3+2:"+((b==0&&a==0)?"b=0":(double)a/a+b));
	}
}
