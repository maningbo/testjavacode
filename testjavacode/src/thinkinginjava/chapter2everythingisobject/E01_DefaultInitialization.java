package thinkinginjava.chapter2everythingisobject;
/**
 *  E01_DefaultInitialization.java
 *  Description:
 *  
 *  CreateDate: 2015年9月30日 下午2:10:21 
 * 
 *  @author 马宁波
 */
public class E01_DefaultInitialization {
	int i;
	char c;
	public E01_DefaultInitialization(){
		System.out.println("i = "+i);
		System.out.println("c = ["+c+"]");
	}
	public static void main(String[] args) {
		new E01_DefaultInitialization();
	}
}
