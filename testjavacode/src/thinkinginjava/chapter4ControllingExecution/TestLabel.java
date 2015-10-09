package thinkinginjava.chapter4ControllingExecution;
/**
 *  TestLabel.java
 *  Description:
 *  
 *  CreateDate: 2015年10月9日 下午2:27:05 
 * 
 *  @author 马宁波
 */
public class TestLabel {
	public static void main(String[] args) {
		int i = 0;
		outer:
		for(;;){
			i++;
			System.out.println("i="+i);
			if(i==5){
				break;
			}
			int j = 0;
			inner:
			for(;;){
				j++;
				System.out.println("j="+j);
				if(j==3){
					continue;
				}
				System.out.println("ddddddddddddd");
				if(j==5){
					break outer;
				}
			}
		}
	}
}
