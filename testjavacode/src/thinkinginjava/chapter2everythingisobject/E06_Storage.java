package thinkinginjava.chapter2everythingisobject;
/**
 *  E06_Storage.java
 *  Description:
 *  
 *  CreateDate: 2015年10月8日 上午8:57:43 
 * 
 *  @author 马宁波
 */
public class E06_Storage {
	String s = "Hello, World!";
	int storage(String s){
		return s.length()*2;
	}
	void print(){
		System.out.println("storage(s) = " + storage(s));
	}
	public static void main(String[] args){
		E06_Storage st = new E06_Storage();
		st.print();
	}
}
