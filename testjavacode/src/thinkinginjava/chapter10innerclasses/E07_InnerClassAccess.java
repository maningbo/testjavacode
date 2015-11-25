package thinkinginjava.chapter10innerclasses;
/**
 *  E07_InnerClassAccess.java
 *  Description:
 *  
 *  CreateDate: 2015年11月2日 上午9:48:42 
 * 
 *  @author 马宁波
 */
public class E07_InnerClassAccess {
	private int i = 10;
	private void f(){
		System.out.println("E07_InnerClassAccess.f");
	}
	class Inner{
		void g(){
			i++;
			f();
		}
	}
	public void h(){
		Inner in = new Inner();
		in.g();
		System.out.println("i="+i);
	}
	public static void main(String[] args) {
		E07_InnerClassAccess ica = new E07_InnerClassAccess();
		ica.h();
	}
}