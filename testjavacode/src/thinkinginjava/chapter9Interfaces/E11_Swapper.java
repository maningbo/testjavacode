package thinkinginjava.chapter9Interfaces;
/**
 *  E11_Swapper.java
 *  Description:
 *  
 *  CreateDate: 2015年10月19日 下午3:01:34 
 * 
 *  @author 马宁波
 */

class CharacterPairSwapper{
	static String swap(String s){
		StringBuilder sb = new StringBuilder(s);
		for (int i = 0; i < sb.length()-1; i+=2) {
			char c1 = sb.charAt(i);
			char c2 = sb.charAt(i+1);
			sb.setCharAt(i, c2);
			sb.setCharAt(i+1, c1);
		}
		return sb.toString();
	}
}

interface Processor{
	public String name();
	public String process(Object input);
}

class SwapperAdapter implements Processor{
	public String name(){
		return CharacterPairSwapper.class.getSimpleName();
	}
	public String process(Object input){
		return CharacterPairSwapper.swap((String)input);
	}
}

class Apply{
	static void process(Processor p,String s){
		System.out.println(p.name());
		System.out.println(p.process(s));
	}
}

public class E11_Swapper {
	public static void main(String[] args) {
		Apply.process(new SwapperAdapter(), "1234");
		Apply.process(new SwapperAdapter(), "abcdef");
	}
}
