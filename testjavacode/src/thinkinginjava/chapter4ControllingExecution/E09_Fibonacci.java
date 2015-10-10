package thinkinginjava.chapter4ControllingExecution;
/**
 *  E09_Fibonacci.java
 *  Description:
 *  
 *  CreateDate: 2015年10月10日 下午1:35:09 
 * 
 *  @author 马宁波
 */
public class E09_Fibonacci {
	static int fib(int n){
		if(n<=2){
			return 1;
		}else{
			return fib(n-1)+fib(n-2);
		}
	}
	public static void main(String[] args) {
		System.out.println(fib(4));
		args = new String[]{"10"};
		//Get the number of Fibonacci from the command line.
		int n = Integer.parseInt(args[0]);
		if(n<0){
			System.out.println("Cannot use negative numbers");
			return;
		}
		for(int i=1;i<=n;i++){
			System.out.print(fib(i)+",");
		}
	}
}
