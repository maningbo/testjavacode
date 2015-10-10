package thinkinginjava.chapter4ControllingExecution;
/**
 *  TestSwitch.java
 *  Description:
 *  
 *  CreateDate: 2015年10月10日 上午9:21:47 
 * 
 *  @author 马宁波
 */
public class TestSwitch {
	public static void switchmethod(int integralSelector){
		switch(integralSelector){
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;
		case 4:
			System.out.println(4);
			break;
		default:
			System.out.println("default");
		}
	}
	public static void main(String[] args) {
		switchmethod(2);
		switchmethod(5);
	}
}
