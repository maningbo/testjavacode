package thinkinginjava.chapter8Polymorphism;

import thinkinginjava.chapter8Polymorphism.cycle.Bicycle;
import thinkinginjava.chapter8Polymorphism.cycle.Cycle;
import thinkinginjava.chapter8Polymorphism.cycle.Tricycle;
import thinkinginjava.chapter8Polymorphism.cycle.Unicycle;

/**
 *  E01_Upcasting.java
 *  Description:
 *  
 *  CreateDate: 2015年10月15日 下午1:19:19 
 * 
 *  @author 马宁波
 */
public class E01_Upcasting {
	public static void ride(Cycle c){}
	public static void main(String[] args) {
		ride(new Cycle());//No upcasting
		ride(new Unicycle());//Upcast
		ride(new Bicycle());//Upcast
		ride(new Tricycle());//Upcast
	}
}
