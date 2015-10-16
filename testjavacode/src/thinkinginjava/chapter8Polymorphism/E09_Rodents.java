package thinkinginjava.chapter8Polymorphism;
import static util.Print.*;
/**
 *  E09_Rodents.java
 *  Description:
 *  
 *  CreateDate: 2015年10月15日 下午4:11:53 
 * 
 *  @author 马宁波
 */

class Rodent{
	public void hop(){println("Rodent hopping");}
	public void scurry(){println("Rodent scurrying");}
	public void reproduce(){println("Making more Rodents");}
	public String toString(){return "Rodent";}
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

public class E09_Rodents {
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
