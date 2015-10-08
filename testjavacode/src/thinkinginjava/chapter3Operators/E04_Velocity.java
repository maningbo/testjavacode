package thinkinginjava.chapter3Operators;
/**
 *  E04_Velocity.java
 *  Description:
 *  
 *  CreateDate: 2015年10月8日 下午1:23:34 
 * 
 *  @author 马宁波
 */
public class E04_Velocity {
	public static void main(String[] args) {
		args = new String[]{"523.4","600.22"};
		if(args.length < 2){
			System.err.println("Usage:java E04_Velocity distance time");
			System.exit(1);
		}
		float distance = Float.parseFloat(args[0]);
		float time = Float.parseFloat(args[1]);
		System.out.print("Velocity = ");
		System.out.print(distance/time);
		System.out.println(" m/s");
	}
}
