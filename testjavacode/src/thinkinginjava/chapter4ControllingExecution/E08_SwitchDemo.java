package thinkinginjava.chapter4ControllingExecution;
/**
 *  E08_SwitchDemo.java
 *  Description:
 *  
 *  CreateDate: 2015年10月10日 下午1:13:39 
 * 
 *  @author 马宁波
 */
public class E08_SwitchDemo {
	public static void main(String[] args) {
		for(int i=0;i<8;i++){
			System.out.println(i);
			switch(i){
				case 1:
					System.out.println("case 1");
					break;
				case 2:
					System.out.println("case 2");
					break;
				case 3:
					System.out.println("case 3");
					break;
				case 4:
					System.out.println("case 4");
					break;
				case 5:
					System.out.println("case 5");
					break;
				default:
					System.out.println("default");
			}
		}
	}
}
