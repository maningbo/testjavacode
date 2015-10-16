package thinkinginjava.chapter8Polymorphism;

import thinkinginjava.chapter8Polymorphism.cycle.Bicycle;
import thinkinginjava.chapter8Polymorphism.cycle.Cycle;
import thinkinginjava.chapter8Polymorphism.cycle.Tricycle;
import thinkinginjava.chapter8Polymorphism.cycle.Unicycle;

/**
 *  E17_RTTI.java
 *  Description:
 *  
 *  CreateDate: 2015年10月16日 上午11:15:21 
 * 
 *  @author 马宁波
 */
public class E17_RTTI {
	public static void main(String[] args) {
		Cycle[] cycles = new Cycle[]{
			new Unicycle(),new Bicycle(),new Tricycle()
		};
		//Compile time: method not found in Cycle
		//cycles[0].balance()
		//cycles[1].balance()
		//cycles[2].balance()
		((Unicycle)cycles[0]).balance();//Downcast/RTTI
		((Bicycle)cycles[1]).balance();//Downcast/RTTI
//		((Unicycle)cycles[2]).balance();//Exception thrown
	}
}
