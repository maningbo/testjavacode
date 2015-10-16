package thinkinginjava.chapter8Polymorphism.oshape;

import thinkinginjava.chapter8Polymorphism.shape.Shape;

/**
 *  Tetrahedron.java
 *  Description:
 *  
 *  CreateDate: 2015年10月15日 下午2:01:21 
 * 
 *  @author 马宁波
 */
public class Tetrahedron extends Shape{

	@Override
	public void draw() {
		System.out.println("Tetrahedron.draw()");
	}

	@Override
	public void erase() {
		System.out.println("Tetrahedron.erase()");
	}

	@Override
	public void msg() {
		System.out.println("Tetrahedron.msg()");
	}

}
