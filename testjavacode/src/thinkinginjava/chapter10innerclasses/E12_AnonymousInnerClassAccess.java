package thinkinginjava.chapter10innerclasses;
/**
 *  E12_AnonymousInnerClassAccess.java
 *  Description:
 *  
 *  CreateDate: 2015年11月4日 下午3:39:18 
 * 
 *  @author 马宁波
 */
public class E12_AnonymousInnerClassAccess {
	private int i = 10;
	private void f(){
		System.out.println("E12_AnonymousInnerClassAccess.f");
	}
	public void h(){
		new Object(){
			void g(){
				i++;
				f();
			}
		}.g();
		System.out.println("i = "+i);
	}
	public static void main(String[] args) {
		E12_AnonymousInnerClassAccess ica = new E12_AnonymousInnerClassAccess();
		ica.h();
	}
}
