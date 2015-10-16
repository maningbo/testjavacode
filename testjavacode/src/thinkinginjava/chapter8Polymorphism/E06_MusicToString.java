package thinkinginjava.chapter8Polymorphism;

import thinkinginjava.chapter8Polymorphism.Note.Note;
import static util.Print.*;

/**
 *  E06_MusicToString.java
 *  Description:
 *  
 *  CreateDate: 2015年10月15日 下午2:42:26 
 * 
 *  @author 马宁波
 */

class Instrument{
	void play(Note n){println("Instrument.play() "+n);}
	public String toString(){return "Instrument";}
	void adjust(){}
}

class Wind extends Instrument{
	void play(Note n){println("Wind.play() "+n);}
	public String toString(){return "Wind";}
}

class Percussion extends Instrument{
	void play(Note n){println("Percussion.play() "+n);}
	public String toString(){return "Percussion";}
}

class Stringed extends Instrument{
	void play(Note n){println("Stringed.play() "+n);}
	public String toString(){return "Stringed";}
}

class Brass extends Wind{
	void play(Note n){println("Brass.play() "+n);}
	void adjust(){println("Brass.adjust()");}
}

class Woodwind extends Wind{
	void play(Note n){println("Woodwind.play() "+n);}
	public String toString(){return "Woodwind";}
}

public class E06_MusicToString {
	static Instrument[] orchestra = {
		new Wind(),
		new Percussion(),
		new Stringed(),
		new Brass(),
		new Woodwind()
	};
	public static void printAll(Instrument... orch){
		for (Instrument instrument : orch) {
			System.out.println(instrument);
		}
	}
	public static void main(String[] args) {
		printAll(orchestra);
	}
}
