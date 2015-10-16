package thinkinginjava.chapter8Polymorphism;

import thinkinginjava.chapter8Polymorphism.oshape.Circle;
import thinkinginjava.chapter8Polymorphism.oshape.Square;
import thinkinginjava.chapter8Polymorphism.oshape.Tetrahedron;
import thinkinginjava.chapter8Polymorphism.oshape.Triangle;
import thinkinginjava.chapter8Polymorphism.shape.Shape;

/**
 *  E04_NewShapeType.java
 *  Description:
 *  
 *  CreateDate: 2015年10月15日 下午2:03:56 
 * 
 *  @author 马宁波
 */
public class E04_NewShapeType {
	public static void main(String[] args) {
		Shape[] shapes = {new Circle(),new Square(),new Triangle(),new Tetrahedron()};
		//Make polymorphic method calls
		for (Shape shape : shapes) {
			shape.draw();
			shape.erase();
			shape.msg();
		}
	}
}
