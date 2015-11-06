package thinkinginjava.chapter10innerclasses;
/**
 *  E16_AnonymousCycleFactories.java
 *  Description:
 *  
 *  CreateDate: 2015年11月6日 上午8:36:00 
 * 
 *  @author 马宁波
 */

interface Cycle{
	int wheels();
}

interface CycleFactory{
	Cycle getCycle();
}

class Unicycle implements Cycle{
	public int wheels(){return 1;}
	public static CycleFactory factory = 
			new CycleFactory() {
				public Cycle getCycle() {
					return new Unicycle();
				}
			};
}

class Bicycle implements Cycle{
	public int wheels(){return 2;}
	public static CycleFactory factory = new CycleFactory() {
		public Cycle getCycle() {
			return new Bicycle();
		}
	};
}

class Tricycle implements Cycle{
	public int wheels(){return 3;}
	public static CycleFactory factory = new CycleFactory() {
		public Cycle getCycle() {
			return new Tricycle();
		}
	};
}

public class E16_AnonymousCycleFactories {
	public static void ride(CycleFactory fact){
		Cycle c = fact.getCycle();
		System.out.println("Num. of wheels:"+c.wheels());
	}
	public static void main(String[] args) {
		ride(Unicycle.factory);
		ride(Bicycle.factory);
		ride(Tricycle.factory);
	}
}
