package thinkinginjava.chapter8Polymorphism;

import thinkinginjava.chapter8Polymorphism.cycle.Bicycle;
import thinkinginjava.chapter8Polymorphism.cycle.Cycle;
import thinkinginjava.chapter8Polymorphism.cycle.Tricycle;
import thinkinginjava.chapter8Polymorphism.cycle.Unicycle;

/**
 *  E05_Wheels.java
 *  Description:
 *  
 *  CreateDate: 2015年10月15日 下午2:32:04 
 * 
 *  @author 马宁波
 */
public class E05_Wheels {
	public static void ride(Cycle c){
		System.out.println("Num. of wheels:"+c.wheels());
	}
	public static void main(String[] args) {
		ride(new Unicycle());
		ride(new Bicycle());
		ride(new Tricycle());
	}
}
