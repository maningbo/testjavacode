package thinkinginjava.chapter9Interfaces;

import thinkinginjava.chapter8Polymorphism.Note.Note;
import static util.Print.*;
/**
 *  E10_PlayableMusic5.java
 *  Description:
 *  
 *  CreateDate: 2015年10月19日 下午2:36:24 
 * 
 *  @author 马宁波
 */

interface Instrument2{
	void adjust();
}

interface Playable{
	void play(Note n);
}

class Wind2 implements Instrument2,Playable{
	public void play(Note n){
		p(this+".play() "+n);
	}
	public String toString(){return "Wind";}
	public void adjust(){p(this+".adjust()");}
}

class Percussion2 implements Instrument2,Playable{
	public void play(Note n){
		p(this+".play() "+n);
	}
	public String toString(){return "Percussion";}
	public void adjust(){p(this+".adjust()");}
}

class Stringed2 implements Instrument2,Playable{
	public void play(Note n){
		p(this+".play() "+n);
	}
	public String toString(){return "Stringed";}
	public void adjust(){p(this+".adjust()");}
}

class Brass2 implements Instrument2,Playable{
	public void play(Note n){
		p(this+".play() "+n);
	}
	public String toString(){return "Brass";}
	public void adjust(){p(this+".adjust()");}
}

class Woodwind2 extends Wind2{
	public String toString(){
		return "Woodwind";
	}
}

public class E10_PlayableMusic5 {
	static void tune(Playable p){p.play(Note.MIDDLE_C);}
	static void tuneAll(Playable[] e){
		for (Playable p : e) {
			tune(p);
		}
	}
	public static void main(String[] args) {
		Playable[] orchestra = {
				new Wind2(),
				new Percussion2(),
				new Stringed2(),
				new Brass2(),
				new Woodwind2()
		};
		tuneAll(orchestra);
	}
}
