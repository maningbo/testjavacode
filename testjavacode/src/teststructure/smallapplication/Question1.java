package teststructure.smallapplication;
/**
 *  Question1.java
 *  Description:
 *  
 *  CreateDate: 2016年1月28日 下午5:51:22 
 * 
 *  @author 马宁波
 */
public class Question1 {
	public static void main(String[] args) {
		//一堆人吃饭 三人一桌余两人 5人余4人 7人余6人 9人余8人 11人正好，问一共多少人
		int j = 0;
		for(int i=0;i<Integer.MAX_VALUE; i++){
			long value=i * 11;
			if (value%3==2&&value%5==4&&value%7==6&&value%9==8){
				System.out.println("value:"+value);
				j++;
				//break;
			}
			if(j==10){
				break;
			}
		}
		System.out.println("=======================3,5,7,9的最小公倍数=============================");
		for (int i = 1; i < 10000; i++) {
			if(i%3==0&&i%5==0&&i%7==0&&i%9==0){
				System.out.println(i);
				break;
			}
		}
	}
}
