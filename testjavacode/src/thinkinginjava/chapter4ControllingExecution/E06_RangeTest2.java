package thinkinginjava.chapter4ControllingExecution;
/**
 *  E06_RangeTest.java
 *  Description:
 *  
 *  CreateDate: 2015年10月10日 下午12:58:31 
 * 
 *  @author 马宁波
 */
public class E06_RangeTest2 {
	static boolean test(int testval,int begin,int end){
		if(testval>=begin&&testval<=end){
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println(test(10, 5, 15));
		System.out.println(test(5, 10, 15));
		System.out.println(test(5, 5, 5));
	}
}
