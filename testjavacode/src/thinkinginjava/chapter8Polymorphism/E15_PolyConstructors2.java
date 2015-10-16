package thinkinginjava.chapter8Polymorphism;
import static util.Print.*;
/**
 *  E15_PolyConstructors2.java
 *  Description:
 *  
 *  CreateDate: 2015年10月16日 上午9:47:07 
 * 
 *  @author 马宁波
 */

class Glyph{
	void draw(){p("Glyph.draw()");}
	Glyph(){
		p("Glyph() before draw()");
		draw();
		p("Glyph() after draw()");
	}
}

class RoundGlyph extends Glyph{
	private int radius = 1;
	RoundGlyph(int r){
		radius = r;
		p("RoundGlyph.RoundGlyph().radius="+radius);
	}
	void draw(){
		p("RoundGlyph.draw().radius="+radius);
	}
}

class RectangularGlyph extends Glyph{
	private int width = 4;
	private int height = 5;
	RectangularGlyph(int width,int height){
		this.width = width;
		this.height = height;
		p("RectangularGlyph.RectangularGlyph().width = "+width + ".height = "+height);
	}
	void draw(){
		p("RectangularGlyph.draw().width = "+width + ".height = "+height);
	}
}

public class E15_PolyConstructors2 {
	public static void main(String[] args) {
		new RoundGlyph(5);
		new RectangularGlyph(2, 2);
	}
}
