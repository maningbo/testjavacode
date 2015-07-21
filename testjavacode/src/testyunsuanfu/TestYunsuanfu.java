package testyunsuanfu;
/**
 *  TestYunsuanfu.java
 *  Description:
 *  
 *  CreateDate: 2015年7月21日 上午9:22:47 
 * 
 *  @author 马宁波
 */
public class TestYunsuanfu {
	public static void main(String[] str){
		System.out.println(Integer.toBinaryString(8) );
		System.out.println(8>>2);//比8/4性能好
		System.out.println(16>>3);//比16/8性能好
		System.out.println(4<<2);//比4*4性能好
		System.out.println(4<<3);//比4*8性能好
	}
}
