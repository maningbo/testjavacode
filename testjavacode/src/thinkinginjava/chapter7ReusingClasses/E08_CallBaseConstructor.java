package thinkinginjava.chapter7ReusingClasses;
/**
 *  E08_CallBaseConstructor.java
 *  Description:
 *  
 *  CreateDate: 2015年10月13日 下午3:50:13 
 * 
 *  @author 马宁波
 */

class BaseNonDefault{
	public BaseNonDefault(int i){}
}

class DerivedTwoConstructors extends BaseNonDefault{
	public DerivedTwoConstructors(){
		super(47);
	}
	public DerivedTwoConstructors(int i) {
		super(i);
	}
	
}

public class E08_CallBaseConstructor {
	public static void main(String[] args) {
		new DerivedTwoConstructors();
		new DerivedTwoConstructors(74);
	}
}
