package thinkinginjava.chapter3Operators;
/**
 *  E05_Dogs.java
 *  Description:
 *  
 *  CreateDate: 2015年10月8日 下午1:45:22 
 * 
 *  @author 马宁波
 */

class Dog{
	String name;
	String says;
}

public class E05_Dogs {
	/*
	 * This walks you through the basics of objects, 
	 * and demonstrates that 
	 * each object has its own distinct storage space. 
	 * */
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		dog1.name = "spot";		dog1.says = "ruff!";
		dog2.name = "scruffy";	dog2.says = "wurf!";
		System.out.println(dog1.name + " says " + dog1.says);
		System.out.println(dog2.name + " says " + dog2.says);
	}
}
