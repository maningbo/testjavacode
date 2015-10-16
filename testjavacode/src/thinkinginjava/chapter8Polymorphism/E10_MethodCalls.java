package thinkinginjava.chapter8Polymorphism;
import static util.Print.*;
/**
 *  E10_MethodCalls.java
 *  Description:
 *  
 *  CreateDate: 2015年10月15日 下午4:24:13 
 * 
 *  @author 马宁波
 */

class TwoMethods{
	public void m1(){
		println("Inside m1. calling m2");
		m2();
	}
	public void m2(){
		println("Inside m2");
	}
}

class Inherited extends TwoMethods{
	public void m2(){
		println("Inside Inherited.m2");
	}
}

public class E10_MethodCalls {
	public static void main(String[] args) {
		TwoMethods x = new Inherited();
		x.m1();
	}
}
