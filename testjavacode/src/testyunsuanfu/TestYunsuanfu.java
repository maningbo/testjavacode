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
		System.out.println(~2);//-3,求反运算符～为单目运算符，具有右结合性。 
		//其功能是对参与运算的数的各二进位按位求反
		//2的二进制=0000 0010 取反=1111 1101
		//3的二进制=0000 0011 取反=1111 1100 再取补=1111 1101 所以 ~2=-3
		//~2是单纯的取反  但是正好等于3的取反+1
		//绝对值取反+1，负数就-1，再反过来就是取反的值了
	}
}
