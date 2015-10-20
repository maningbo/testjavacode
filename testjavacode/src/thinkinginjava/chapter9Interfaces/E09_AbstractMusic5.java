package thinkinginjava.chapter9Interfaces;

import thinkinginjava.chapter8Polymorphism.Note.Note;
import static util.Print.*;
/**
 *  E09_AbstractMusic5.java
 *  Description:
 *  
 *  CreateDate: 2015年10月19日 下午1:44:04 
 * 
 *  @author 马宁波
 */

abstract class Instrument{
	public void play(Note n){
		p(this+".play() "+n);
	}
	public void adjust(){
		p(this+".adjust()");
	}
	//Forces implementation in derived class
	public abstract String toString();
}

class Wind extends Instrument{
	public String toString() {return "Wind";}
}

class Percussion extends Instrument{
	public String toString() {return "Percussion";}
}

class Stringed extends Instrument{
	public String toString() {return "Stringed";}
}

class Brass extends Instrument{
	public String toString() {return "Brass";}
}

class Woodwind extends Wind{
	public String toString() {return "Woodwind";}
}

public class E09_AbstractMusic5 {
	static void tune(Instrument i){
		i.adjust();
		i.play(Note.MIDDLE_C);
	}
	static void tuneAll(Instrument[] e){
		for (Instrument i : e) {
			tune(i);
		}
	}
	public static void main(String[] args) {
		Instrument[] orchestra = {
			new Wind(),
			new Percussion(),
			new Stringed(),
			new Brass(),
			new Woodwind()
		};
		tuneAll(orchestra);
	}
}
