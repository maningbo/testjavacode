package thinkinginjava.chapter4ControllingExecution;
/**
 *  TestRecursion.java
 *  Description:
 *  
 *  CreateDate: 2015年10月10日 下午1:53:25 
 * 
 *  @author 马宁波
 */
public class TestRecursion {
	static int jiecheng(int n){
		if(n==1){
			return 1;
		}else{
			return n*jiecheng(n-1);
		}
	}
	public static void main(String[] args) {
		System.out.println(jiecheng(10));
	}
}
