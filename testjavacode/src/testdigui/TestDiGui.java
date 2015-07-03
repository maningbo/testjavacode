package testdigui;
/**
 *  TestDiGui.java
 *  Description:
 *  
 *  CreateDate: 2015年7月3日 下午2:28:09 
 * 
 *  @author 马宁波
 */
public class TestDiGui {

	public static int jiecheng(int n){
		if(n==1||n==0){
			return n;
		}else{
			return n*jiecheng(n-1);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(jiecheng(3));
	}
}
