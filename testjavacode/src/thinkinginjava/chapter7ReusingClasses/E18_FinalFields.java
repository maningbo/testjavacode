package thinkinginjava.chapter7ReusingClasses;
/**
 *  E18_FinalFields.java
 *  Description:
 *  
 *  CreateDate: 2015年10月13日 下午5:33:20 
 * 
 *  @author 马宁波
 */

class SelfCounter{
	private static int count;
	private int id = count++;
	public String toString(){
		return "SelfCounter"+id;
	}
}

class WithFinalFields{
	final SelfCounter scf = new SelfCounter();
	static final SelfCounter scsf = new SelfCounter();
	public String toString(){
		return "scf="+scf+"\nscsf="+scsf;
	}
}

public class E18_FinalFields {
	public static void main(String[] args) {
		System.out.println("First object:");
		System.out.println(new WithFinalFields());
		System.out.println("Second object:");
		System.out.println(new WithFinalFields());
	}
}
