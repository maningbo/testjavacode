package thinkinginjava.chapter8Polymorphism.oshape;

import java.util.Random;

import thinkinginjava.chapter8Polymorphism.shape.Shape;

/**
 *  RandomShapeGenerator.java
 *  Description:
 *  
 *  CreateDate: 2015年10月15日 下午1:42:40 
 * 
 *  @author 马宁波
 */
public class RandomShapeGenerator {
	private Random rand = new Random();
	public Shape next(){
		switch(rand.nextInt(3)){
			case 0:return new Circle();
			case 1:return new Square();
			case 2: return new Triangle();
			default:return null;
		}
	}
}
