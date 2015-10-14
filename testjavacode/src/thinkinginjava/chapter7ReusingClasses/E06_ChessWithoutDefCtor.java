package thinkinginjava.chapter7ReusingClasses;
/**
 *  E06_ChessWithoutDefCtor.java
 *  Description:
 *  
 *  CreateDate: 2015年10月13日 下午3:30:38 
 * 
 *  @author 马宁波
 */

class BoardGame{
	BoardGame(int d){System.out.println("BoardGame Constructor(int d)");}
	BoardGame(){System.out.println("BoardGame Constructor");}
}

class ChessWithoutDefCtor extends BoardGame{
//	ChessWithoutDefCtor(){
//		System.out.println("ChessWithoutDefCtor Constructor");
//	}
}

public class E06_ChessWithoutDefCtor {
	public static void main(String[] args) {
		new ChessWithoutDefCtor();
	}
}
