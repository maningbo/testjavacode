package thinkinginjava.chapter7ReusingClasses;
/**
 *  E03_CartoonWithDefCtor.java
 *  Description:
 *  
 *  CreateDate: 2015年10月13日 下午3:08:00 
 * 
 *  @author 马宁波
 */

class Drawing{
	public Drawing() {
		System.out.println("Drawing Constructor");
	}
}

class CartoonWithDefCtor extends Drawing{
//	public CartoonWithDefCtor() {
//		System.out.println("CartoonWithDefCtor Constructor");
//	}
}

public class E03_CartoonWithDefCtor {
	public static void main(String[] args) {
		new CartoonWithDefCtor();
	}
}
