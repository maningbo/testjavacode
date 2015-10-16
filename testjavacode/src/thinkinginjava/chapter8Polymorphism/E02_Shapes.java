package thinkinginjava.chapter8Polymorphism;

import thinkinginjava.chapter8Polymorphism.oshape.RandomShapeGenerator;
import thinkinginjava.chapter8Polymorphism.shape.Shape;

/**
 *  E02_Shapes.java
 *  Description:
 *  
 *  CreateDate: 2015年10月15日 下午1:47:57 
 * 
 *  @author 马宁波
 */
public class E02_Shapes {
	private static RandomShapeGenerator gen = new RandomShapeGenerator();
	public static void main(String[] args) {
		Shape[] shapes = new Shape[9];
		//Fill up the array with shapes
		for (int i = 0; i < shapes.length; i++) {
			shapes[i] = gen.next();
		}
		//Make polymorphic method calls
		for (Shape shape : shapes) {
			shape.draw();
		}
	}
}
