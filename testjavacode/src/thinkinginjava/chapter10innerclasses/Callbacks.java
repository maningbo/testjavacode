package thinkinginjava.chapter10innerclasses;
import static util.Print.*;
/**
 *  Callbacks.java
 *  Description:
 *  
 *  CreateDate: 2015年10月23日 下午1:01:14 
 * 
 *  @author 马宁波
 */

interface Incrementable{
	void increment();
}

//Very simple to just implement the interface
class Callee1 implements Incrementable{
	private int i = 0;
	public void increment(){
		i++;
		p(i);
	}
}

class MyIncrement{
	public void increment(){p("Other operation");}
	static void f(MyIncrement mi){mi.increment();}
}

//If your class must implement increment() in
//some other way,you must use an inner class:
class Callee2 extends MyIncrement{
	private int i =0;
	public void increment(){
		super.increment();
		i++;
		p(i);
	}
	private class Closure implements Incrementable{
		public void increment(){
			//Specify outer-class method,otherise
			//you'd get an infinite recursion:
			Callee2.this.increment();
		}
	}
	Incrementable getCallbackReference(){
		return new Closure();
	}
}

class Caller{
	private Incrementable callbackReference;
	Caller(Incrementable cbh){callbackReference = cbh;}
	void go(){callbackReference.increment();}
}

public class Callbacks {
	public static void main(String[] args) {
		Callee1 c1 = new Callee1();
		Callee2 c2 = new Callee2();
		MyIncrement.f(c2);
		Caller caller1 = new Caller(c1);
		Caller caller2 = new Caller(c2.getCallbackReference());
		caller1.go();
		caller1.go();
		caller2.go();
		caller2.go();
	}
}
