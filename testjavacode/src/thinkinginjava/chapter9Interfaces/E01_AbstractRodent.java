package thinkinginjava.chapter9Interfaces;
import static util.Print.*;
/**
 *  E01_AbstractRodent.java
 *  Description:
 *  
 *  CreateDate: 2015年10月16日 下午5:07:53 
 * 
 *  @author 马宁波
 */

abstract class Rodent{
	public abstract void hop();
	public abstract void scurry();
	public abstract void reproduce();
}

class Mouse extends Rodent{
	public void hop(){println("Mouse hopping");}
	public void scurry(){println("Mouse scurrying");}
	public void reproduce(){println("Making more Mouse");}
	public String toString(){return "Mouse";}
}

class Gerbil extends Rodent{
	public void hop(){println("Gerbil hopping");}
	public void scurry(){println("Gerbil scurrying");}
	public void reproduce(){println("Making more Gerbil");}
	public String toString(){return "Gerbil";}
}

class Hamster extends Rodent{
	public void hop(){println("Hamster hopping");}
	public void scurry(){println("Hamster scurrying");}
	public void reproduce(){println("Making more Hamster");}
	public String toString(){return "Hamster";}
}

public class E01_AbstractRodent {
	public static void main(String[] args) {
		Rodent[] rodents = {
			new Mouse(),
			new Gerbil(),
			new Hamster()
		};
		for (Rodent rodent : rodents) {
			rodent.hop();
			rodent.scurry();
			rodent.reproduce();
			System.out.println(rodent);
		}
	}
}
