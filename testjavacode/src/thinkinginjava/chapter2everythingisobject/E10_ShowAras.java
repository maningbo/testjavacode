package thinkinginjava.chapter2everythingisobject;
/**
 *  E10_ShowAras.java
 *  Description:
 *  
 *  CreateDate: 2015年10月8日 上午9:42:50 
 * 
 *  @author 马宁波
 */
public class E10_ShowAras {
	public static void main(String[] args){
		System.out.println(args.length);
		if(args.length < 3){
			System.err.println("Need 3 arguments");
			System.exit(1);
		}
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
	}
}
