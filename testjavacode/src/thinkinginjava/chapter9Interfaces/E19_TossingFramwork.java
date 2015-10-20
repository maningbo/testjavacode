package thinkinginjava.chapter9Interfaces;
/**
 *  E19_TossingFramwork.java
 *  Description:
 *  
 *  CreateDate: 2015年10月20日 上午8:52:08 
 * 
 *  @author 马宁波
 */

interface Tossing{boolean event();}
interface TossingFactory{Tossing getTossing();}
class CoinTossing implements Tossing{
	private int events;
	private static final int EVENTS = 2;
	public boolean event(){
		System.out.println("Coin tossing event "+events);
		return ++events!=EVENTS;
	}
}
class CoinTossingFactory implements TossingFactory{
	public CoinTossing getTossing(){
		return new CoinTossing();
	}
}
class DiceTossing implements Tossing{
	private int events;
	private static final int EVENTS = 6;
	public boolean event(){
		System.out.println("Dice tossing event "+events);
		return ++events!=EVENTS;
	}
}
class DiceTossingFactory implements TossingFactory{
	public DiceTossing getTossing(){
		return new DiceTossing();
	}
}

public class E19_TossingFramwork {
	public static void simulate(TossingFactory fact){
		Tossing t = fact.getTossing();
		while(t.event())
			;
	}
	public static void main(String[] args) {
		simulate(new CoinTossingFactory());
		simulate(new DiceTossingFactory());
	}
}
