package thinkinginjava.chapter5InitializationCleanup;
/**
 *  E06_SwappedArguments.java
 *  Description:
 *  
 *  CreateDate: 2015年10月12日 上午11:15:04 
 * 
 *  @author 马宁波
 */

class Dog2{
	public void bark(int i,double d){
		System.out.println("int,double bark");
	}
	public void bark(double d,int i){
		System.out.println("double,int bark");
	}
}

public class E06_SwappedArguments {
	public static void main(String[] args) {
		Dog2 dog = new Dog2();
		dog.bark(0, 0f);
		dog.bark(0f, 0);
	}
}
