package thinkinginjava;
/**
 *  TestMain.java
 *  Description:
 *  
 *  CreateDate: 2015年9月9日 上午8:29:51 
 * 
 *  @author 马宁波
 */

class A{
	A(){
		System.out.println("A");
	}
}
class B{
	B(){
		System.out.println("B");
	}
}

class TestConstructor{
	A a = new A();
	static B b = new B();
	TestConstructor(){
		System.out.println("TestConstructor");
	}
}

public class TestMain{
	public static void main(String[] args){
		//System.getProperties().list(System.out);
		//System.out.println(System.getProperty("user.name"));
		//System.out.println(System.getProperties());
		System.out.println(System.getProperty("java.library.path"));
		//\b单词边界
		//\f换页符
		//\r回车
		//\n换行符
		//\t制表符
		//\"转义"
		//\'应该没有这个
		//\\转义 \
		System.out.println("d\td\nd\rd\fd\\''''\\\b\"\\;/");
		Integer a = new Integer(2);
		new TestConstructor();
	}
}