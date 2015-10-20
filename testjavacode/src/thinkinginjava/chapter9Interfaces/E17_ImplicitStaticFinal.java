package thinkinginjava.chapter9Interfaces;
/**
 *  E17_ImplicitStaticFinal.java
 *  Description:
 *  
 *  CreateDate: 2015年10月19日 下午5:55:05 
 * 
 *  @author 马宁波
 */

interface StaticFinalTest{
	String RED = "Red";
}
class Test implements StaticFinalTest{
	public Test(){
		//Compile-time error:cannot assign a value
		//to final variable RED
		//! RED = "Blue";
	}
}

//The compiler tells you RED is a final variable 
//when you try to assign a value to it. 
//RED is clearly static because you can access 
//it using static syntax. 
public class E17_ImplicitStaticFinal {
	public static void main(String[] args) {
		//Accessing as a static field:
		System.out.println("StaticFinalTest.RED="+StaticFinalTest.RED);
	}
}
