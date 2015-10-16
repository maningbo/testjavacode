package thinkinginjava.chapter8Polymorphism;
import static util.Print.*;
/**
 *  E13_VerifiedRefCounting.java
 *  Description:
 *  
 *  CreateDate: 2015年10月15日 下午6:21:52 
 * 
 *  @author 马宁波
 */

class Shared{
	private int refcount = 0;
	private static int counter = 0;
	private int id = counter++;
	public Shared(){
		System.out.println("Creating "+this);
	}
	public void addRef(){refcount++;}
	protected void dispose(){
		if(--refcount==0){
			p("Disposing "+this);
		}
	}
	protected void finalize(){
		if(refcount!=0){
			p("Error:object is not properly cleaned-up");
		}
	}
	public String toString(){return "Shared "+id;}
	
	public int getRefcount(){
		return this.refcount;
	}
}

class Composing{
	private Shared shared;
	private static int counter = 0;
	private int id = counter++;
	public Composing(Shared shared){
		p("Creating "+this);
		this.shared = shared;
		this.shared.addRef();
	}
	protected void dispose(){
		p("disposing "+this+" shared.refcount="+shared.getRefcount());
		shared.dispose();
	}
	public String toString(){
		return "Composing "+id;
	}
}

public class E13_VerifiedRefCounting {
	public static void main(String[] args) {
		Shared shared = new Shared();
		Composing[] composing = {
				new Composing(shared),
				new Composing(shared),
				new Composing(shared),
				new Composing(shared),
				new Composing(shared)
		};
		for (Composing c : composing) {
			c.dispose();
		}
		System.gc();
		//Verify failure
		new Composing(new Shared());
		System.gc();
	}
}
