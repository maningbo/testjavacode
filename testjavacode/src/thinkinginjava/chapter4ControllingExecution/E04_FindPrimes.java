package thinkinginjava.chapter4ControllingExecution;
/**
 *  E04_FindPrimes.java
 *  Description:
 *  Write a program to detect and print prime numbers 
 *  (integers evenly divisible only by themselves 
 *  and 1), using two nested for loops and the 
 *  modulus operator (%). 
 *  CreateDate: 2015年10月10日 上午10:26:17 
 * 
 *  @author 马宁波
 */
public class E04_FindPrimes {
	public static void main(String[] args) {
		int max = 100;
		//Get the max value from command line.
		//if the argument has been provided.
		if(args.length!=0){
			max = Integer.parseInt(args[0]);
		}
		for(int i=1;i<max;i++){
			boolean prime = true;
			for(int j=2;j<i;j++){//除了1和j本身并小于j的所有书
				if(i%j==0){
					prime = false;
				}
			}
			if(prime){
				System.out.print(i+" ");
			}
		}
	}
}
