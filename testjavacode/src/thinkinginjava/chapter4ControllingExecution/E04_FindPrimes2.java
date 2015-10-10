package thinkinginjava.chapter4ControllingExecution;

import static java.lang.Math.*;

/**
 *  E04_FindPrimes2.java
 *  Description:
 *  
 *  CreateDate: 2015年10月10日 上午10:39:19 
 * 
 *  @author 马宁波
 */
public class E04_FindPrimes2 {
	public static void main(String[] args) {
		int max = 100;
		//Get the max value from the command line.
		//if the argument has been provided.
		if(args.length!=0){
			max = Integer.parseInt(args[0]);
		}
		boolean[] sieve = new boolean[max+1];
		int limit = (int)floor(sqrt(max));
		System.out.print(1+" ");
		if(max>1){
			System.out.print(2+" ");
		}
		//Detect prime numbers???
		for(int i=3;i<=limit;i+=2){
			if(!sieve[i]){
				for(int j=2*i;j<=max;j+=i){
					sieve[j] = true;
				}
			}
		}
		//Print prime numbers
		for(int i=3;i<=max;i+=2){
			if(!sieve[i]){
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println(floor(3.2));
		System.out.println(floor(3.6));
		System.out.println(sqrt(9));
	}
}
