package thinkinginjava.chapter4ControllingExecution;
/**
 *  E07_To98.java
 *  Description:
 *  
 *  CreateDate: 2015年10月10日 下午1:09:53 
 * 
 *  @author 马宁波
 */
public class E07_To98 {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++){
			if(i==99){
				break;
			}
			System.out.print(i+" ");
		}
	}
}
