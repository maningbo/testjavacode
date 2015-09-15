package thinkinginjava.chapter2everythingisobject;

/**
 * E07_Incrementable.java Description:
 * 
 * CreateDate: 2015年9月15日 上午8:23:13
 * 
 * @author 马宁波
 */
class StaticTest {
	static int i = 47;
}

public class E07_Incrementable {
	static void increment() {
		StaticTest.i++;
	}

	public static void main(String[] args) {
		E07_Incrementable sf = new E07_Incrementable();
		sf.increment();
		E07_Incrementable.increment();
		increment();
		System.out.println(StaticTest.i);
	}
} // /:~
