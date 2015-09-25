package designpatterns.adapter.interfaceadapter;
/**
 *  TestInterfaceAdapter.java
 *  Description:
 *  
 *  CreateDate: 2015年9月25日 下午4:44:18 
 * 
 *  @author 马宁波
 */
public class TestInterfaceAdapter {
	public static void main(String[] args) {
		//当不希望实现一个接口中所有的方法时，可以创建一个抽象类Wrapper，实现所有方法，我们写别的类的时候，继承抽象类即可。
		InterfaceAdapter ia1 = new Class1();
		InterfaceAdapter ia2 = new Class2();
		ia1.method1();
		ia1.method2();
		ia2.method1();
		ia2.method2();
	}
}
