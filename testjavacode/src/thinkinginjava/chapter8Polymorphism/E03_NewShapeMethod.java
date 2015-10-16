package thinkinginjava.chapter8Polymorphism;

import thinkinginjava.chapter8Polymorphism.oshape.Circle;
import thinkinginjava.chapter8Polymorphism.oshape.Square;
import thinkinginjava.chapter8Polymorphism.oshape.Triangle;
import thinkinginjava.chapter8Polymorphism.shape.Shape;

/**
 *  E03_NewShapeMethod.java
 *  Description:
 *  
 *  CreateDate: 2015年10月15日 下午1:51:37 
 * 
 *  @author 马宁波
 */
public class E03_NewShapeMethod {
	public static void main(String[] args) {
		Shape[] shapes = {new Circle(),new Square(),new Triangle()};
		//Make polymophic method calls
		for (Shape shape : shapes) {
			shape.draw();
			shape.erase();
			shape.msg();
		}
	}
}
