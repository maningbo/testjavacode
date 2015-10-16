package thinkinginjava.chapter8Polymorphism;
/**
 *  E08_RandomInstruments.java
 *  Description:
 *  
 *  CreateDate: 2015年10月15日 下午3:36:09 
 * 
 *  @author 马宁波
 */

class InstrumentGenerator{
	java.util.Random gen = new java.util.Random();
	public Instrument next(){
		switch(gen.nextInt(6)){
			default:
			case 0:return new Wind();
			case 1:return new Percussion();
			case 2:return new Stringed();
			case 3:return new Brass();
			case 4:return new Woodwind();
			case 5:return new Electronic();
		}
	}
}

public class E08_RandomInstruments {
	public static void main(String[] args) {
		InstrumentGenerator gen = new InstrumentGenerator();
		for (int i = 0; i < 20; i++) {
			System.out.println(gen.next());
		}
	}
}
