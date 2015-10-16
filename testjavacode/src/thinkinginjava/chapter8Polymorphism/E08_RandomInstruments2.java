package thinkinginjava.chapter8Polymorphism;
/**
 *  E08_RandomInstruments.java
 *  Description:
 *  
 *  CreateDate: 2015年10月15日 下午3:36:09 
 * 
 *  @author 马宁波
 */

class InstrumentGenerator2{
	java.util.Random gen = new java.util.Random();
	Class<?> instruments[] = {
		Wind.class,
		Percussion.class,
		Stringed.class,
		Brass.class,
		Woodwind.class,
		Electronic.class
	};
	public Instrument next(){
		try{
			int idx = Math.abs(gen.nextInt(instruments.length));
			return (Instrument) instruments[idx].newInstance();
		}catch(Exception e){
			throw new RuntimeException("Cannot Create", e);
		}
	}
}

public class E08_RandomInstruments2 {
	public static void main(String[] args) {
		InstrumentGenerator2 gen = new InstrumentGenerator2();
		for (int i = 0; i < 20; i++) {
			System.out.println(gen.next());
		}
	}
}
