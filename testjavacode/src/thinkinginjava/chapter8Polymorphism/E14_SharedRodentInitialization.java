package thinkinginjava.chapter8Polymorphism;
import static util.Print.*;
/**
 *  E14_SharedRodentInitialization.java
 *  Description:
 *  
 *  CreateDate: 2015年10月16日 上午8:56:29 
 * 
 *  @author 马宁波
 */

class NonSharedMember{
	public NonSharedMember(String id){
		p("Non shared member constructor "+id);
	}
}

class SharedMember{
	private int refcount;//被引用的次数
	public void addRef(){
		p("Number of references "+ ++refcount);
	}
	protected void dispose(){
		if(--refcount == 0){
			p("Disposing "+ this);
		}
	}
	public SharedMember(){
		p("Shared member constructor");
	}
	public String toString(){
		return "Shared member";
	}
}

class Rodent3{
	private SharedMember m;
	NonSharedMember m1 = new NonSharedMember("r1"),
					m2 = new NonSharedMember("r2");
	public Rodent3(SharedMember sm){
		p("Rodent constructor");
		m = sm;
		m.addRef();
	}
	public void hop(){p("Rodent hopping");}
	public void scurry(){p("Rodent scurrying");}
	public void reproduce(){p("Making more Rodents");}
	public void dispose(){
		p("Disposing "+this);
		m.dispose();
	}
	public String toString(){return "Rodent";}
}

class Mouse3 extends Rodent3{
	NonSharedMember m1 = new NonSharedMember("m1"),
					m2 = new NonSharedMember("m2");
	public Mouse3(SharedMember sm){
		super(sm);
		p("Mouse constructor");
	}
	public void hop(){p("Mouse hopping");}
	public void scurry(){p("Mouse scurrying");}
	public void reproduce(){p("Making more Mice");}
	public String toString(){return "Mouse";}
}

class Gerbil3 extends Rodent3{
	NonSharedMember m1 = new NonSharedMember("g1"),
					m2 = new NonSharedMember("g2");
	public Gerbil3(SharedMember sm){
		super(sm);
		p("Gerbil constructor");
	}
	public void hop(){p("Gerbil hopping");}
	public void scurry(){p("Gerbil scurrying");}
	public void reproduce(){p("Making more Gerbils");}
	public String toString(){return "Gerbil";}
}

class Hamster3 extends Rodent3{
	NonSharedMember m1 = new NonSharedMember("h1"),
					m2 = new NonSharedMember("h2");
	public Hamster3(SharedMember sm){
		super(sm);
		p("Hamster constructor");
	}
	public void hop(){p("Hamster hopping");}
	public void scurry(){p("Hamster scurrying");}
	public void reproduce(){p("Making more Hamsters");}
	public String toString(){return "Hamster";}
}

public class E14_SharedRodentInitialization {
	public static void main(String[] args) {
		SharedMember sm = new SharedMember();
		Rodent3[] rodent3 = {
			new Hamster3(sm),
			new Gerbil3(sm),
			new Mouse3(sm)
		};
		for (Rodent3 r : rodent3) {
			r.dispose();
		}
	}
}
