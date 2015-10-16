package thinkinginjava.chapter8Polymorphism;
import static util.Print.*;
/**
 *  E12_RodentInitialization.java
 *  Description:
 *  
 *  CreateDate: 2015年10月15日 下午6:04:29 
 * 
 *  @author 马宁波
 */

class Member{
	public Member(String id){
		p("Member constructor "+id);
	}
}

class Rodent2{
	Member m1 = new Member("r1"),m2 = new Member("r2");
	public Rodent2(){p("Rodent2 constructor");}
	public void hop(){p("Rodent2 hopping");}
	public void scurry(){p("Rodent2 scurrying");}
	public void reproduce(){p("Making more Rodent2s");}
	public String toString(){return "Rodent2";}
}

class Mouse2 extends Rodent2{
	Member m1 = new Member("m1"),m2 = new Member("m2");
	public Mouse2(){p("Mouse2 constructor");}
	public void hop(){p("Mouse2 hopping");}
	public void scurry(){p("Mouse2 scurrying");}
	public void reproduce(){p("Making more Mouse2s");}
	public String toString(){return "Mouse2";}
}

class Gerbil2 extends Rodent2{
	Member m1 = new Member("g1"),m2 = new Member("g2");
	public Gerbil2(){p("Gerbil2 constructor");}
	public void hop(){p("Gerbil2 hopping");}
	public void scurry(){p("Gerbil2 scurrying");}
	public void reproduce(){p("Making more Gerbil2s");}
	public String toString(){return "Gerbil2";}
}

class Hamster2 extends Rodent2{
	Member m1 = new Member("h1"),m2 = new Member("h2");
	public Hamster2(){p("Hamster2 constructor");}
	public void hop(){p("Hamster2 hopping");}
	public void scurry(){p("Hamster2 scurrying");}
	public void reproduce(){p("Making more Hamster2s");}
	public String toString(){return "Hamster2";}
}

public class E12_RodentInitialization {
	public static void main(String[] args) {
		new Hamster2();
	}
}
