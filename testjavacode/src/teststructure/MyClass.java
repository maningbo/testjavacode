package teststructure;
/**
 *  MyClass.java
 *  Description:
 *  
 *  CreateDate: 2015年10月14日 下午5:29:31 
 * 
 *  @author 马宁波
 */
public class MyClass {
	private String name;
	public static void main(String[] args) {
		MyClass m1 = new MyClass();
		MyClass m2 = new MyClass();
		
		m1.name = m2.name = "m1";
		
		CallMe(m1,m2);
		
		System.out.println(m1.name+"&"+m2.name);
		System.out.println(m1==m2);
		System.out.println(m1+"&"+m2);//没有重写toString方法时打印对象的地址
	}
	private static void CallMe(MyClass... m){
		m[0] = m[1];//改编的数据元素（对数据元素的赋值动作），但对象本身没有改变
		m[1].name = "new name";
	}
}
