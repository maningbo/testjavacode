package thinkinginjava.chapter8Polymorphism.oshape;

import thinkinginjava.chapter8Polymorphism.shape.Shape;

/**
 *  Square.java
 *  Description:
 *  
 *  CreateDate: 2015年10月15日 下午1:37:50 
 * 
 *  @author 马宁波
 */
public class Square extends Shape{

	@Override
	public void draw() {
		System.out.println("Square.draw()");
	}

	@Override
	public void erase() {
		System.out.println("Square.erase()");
	}

}
