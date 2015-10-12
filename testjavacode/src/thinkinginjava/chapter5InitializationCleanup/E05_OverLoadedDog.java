package thinkinginjava.chapter5InitializationCleanup;
/**
 *  E05_OverLoadedDog.java
 *  Description:
 *  
 *  CreateDate: 2015年10月12日 上午11:03:40 
 * 
 *  @author 马宁波
 */

class Dog{
	public void bark(){
		System.out.println("Default bark!");
	}
	public void bark(int i){
		System.out.println("int bark = howl");
	}
	public void bark(double d){
		System.out.println("dobule bark = yip");
	}
//	public boolean print(){
//		return false;
//	}
//	public long print(){
//		return 0f;
//	}
}

public class E05_OverLoadedDog {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.bark();
		dog.bark(0);
		dog.bark(0f);
	}
}
