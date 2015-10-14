package thinkinginjava.chapter7ReusingClasses;
/**
 *  E23_ClassLoading.java
 *  Description:
 *  
 *  CreateDate: 2015年10月14日 上午9:52:21 
 * 
 *  @author 马宁波
 */

class LoadTest{
	//The static Clause is executed
	//upon class loading
	static{
		System.out.println("Loading LoadTest");
	}
	static void staticMember(){
		System.out.println("LoadTest.staticMember()");
	}
}

public class E23_ClassLoading {
	//Now modify the code so object creation occurs 
	//before the static member call to see that object 
	//creation loads the object. Remember, a constructor 
	//is a static method, even though you don’t define 
	//it using the static keyword. 
	public static void main(String[] args) {
		System.out.println("Calling static member");
		LoadTest.staticMember();
		System.out.println("Creating an object");
		new LoadTest();
	}
}
