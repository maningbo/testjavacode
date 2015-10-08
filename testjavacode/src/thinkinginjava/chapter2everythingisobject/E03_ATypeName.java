package thinkinginjava.chapter2everythingisobject;
/**
 *  E03_ATypeName.java
 *  Description:
 *  
 *  CreateDate: 2015年10月8日 上午8:35:57 
 * 
 *  @author 马宁波
 */
public class E03_ATypeName {
	static{
		//只会被执行一次
		System.out.println("静态代码块！");
	}
	public E03_ATypeName(){
		System.out.println("无参构造！");
	}
	public static void staticmethod(){
		System.out.println("静态方法！");
	}
	public void method(){
		System.out.println("非静态方法！");
	}
	public static void main(String[] args){
		E03_ATypeName.staticmethod();
		E03_ATypeName.staticmethod();
		E03_ATypeName a = new E03_ATypeName();
		a.method();
	}
}
