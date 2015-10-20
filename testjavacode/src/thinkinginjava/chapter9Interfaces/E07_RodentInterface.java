package thinkinginjava.chapter9Interfaces;
import static util.Print.*;
/**
 *  E07_RodentInterface.java
 *  Description:
 *  
 *  CreateDate: 2015年10月19日 上午9:43:49 
 * 
 *  @author 马宁波
 */

interface Rodent2{
	void hop();
	void scurry();
	void reproduce();
}

class Mouse2 implements Rodent2{
	public void hop(){p("Mouse hopping");}
	public void scurry(){p("Mouse scurrying");}
	public void reproduce(){p("Making more Mice");}
	public String toString(){return "Mouse";}
}

class Gerbil2 implements Rodent2{
	public void hop(){p("Gerbil hopping");}
	public void scurry(){p("Gerbil scurrying");}
	public void reproduce(){p("Making more Gerbils");}
	public String toString(){return "Gerbil";}
}

class Hamster2 implements Rodent2{
	public void hop(){p("Hamster hopping");}
	public void scurry(){p("Hamster scurrying");}
	public void reproduce(){p("Making more Hamsters");}
	public String toString(){return "Hamster";}
}

public class E07_RodentInterface {
	public static void main(String[] args) {
		Rodent2[] rodents = {
			new Mouse2(),
			new Gerbil2(),
			new Hamster2()
		};
		for (Rodent2 r : rodents) {
			r.hop();
			r.scurry();
			r.reproduce();
			p(r+"");
		}
	}
}
