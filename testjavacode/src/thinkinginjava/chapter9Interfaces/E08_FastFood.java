package thinkinginjava.chapter9Interfaces;
import static util.Print.*;
/**
 *  E08_FastFood.java
 *  Description:
 *  
 *  CreateDate: 2015年10月19日 上午10:08:42 
 * 
 *  @author 马宁波
 */

class Pickle{
	Pickle(){p("Pickle");}
}

class Meal{
	Meal(){println("Meal()");}
}

class Bread{
	Bread(){p("Bread()");}
}

class Cheese{
	Cheese(){p("Cheese()");}
}

class Lettuce{
	Lettuce(){p("Lettuce()");}
}

class Lunch extends Meal{
	Lunch(){p("Lunch()");}
}

class PortableLunch extends Lunch{
	PortableLunch(){p("PortableLunch()");}
}

class Sandwich extends PortableLunch{
	Bread b = new Bread();
	Cheese c = new Cheese();
	Lettuce l = new Lettuce();
	Pickle p = new Pickle();
	Sandwich(){
		p("Sandwich()");//先初始化对象，然后调用导出类构造方法
	}
	
}

interface FastFood{
	void rushOrder();
	void gobble();
}

class FastSandwich extends Sandwich implements FastFood{
	public void rushOrder(){
		p("Rushing your sandwich order");
	}
	public void gobble(){p("Chomp! Snort! Gobble!");}
}

public class E08_FastFood {
	public static void main(String[] args) {
		FastSandwich burger = new FastSandwich();
		p("Fries with that?");
		p("Super Size");
		burger.rushOrder();
		burger.gobble();
	}
}
