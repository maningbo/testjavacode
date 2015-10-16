package thinkinginjava.chapter8Polymorphism;

import thinkinginjava.chapter8Polymorphism.Note.Note;
import static util.Print.*;

/**
 *  E07_NewInstrument.java
 *  Description:
 *  
 *  CreateDate: 2015年10月15日 下午3:26:24 
 * 
 *  @author 马宁波
 */

class Electronic extends Instrument{
	void play(Note n){println("Electronic.play() "+n);}
	public String toString(){return "Electronic";}
}

public class E07_NewInstrument {
	static Instrument[] orchestra = {
		new Wind(),
		new Percussion(),
		new Stringed(),
		new Brass(),
		new Woodwind(),
		new Electronic()
	};
	public static void main(String[] args) {
		for (Instrument i : orchestra) {
			i.play(Note.MIDDLE_C);
			i.adjust();
			System.out.println(i);
		}
	}
}
