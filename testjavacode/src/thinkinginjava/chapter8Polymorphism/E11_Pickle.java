package thinkinginjava.chapter8Polymorphism;
import static util.Print.*;
/**
 *  E11_Pickle.java
 *  Description:
 *  
 *  CreateDate: 2015年10月15日 下午4:33:58 
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

public class E11_Pickle {
	public static void main(String[] args) {
		new Sandwich();
	}
}
