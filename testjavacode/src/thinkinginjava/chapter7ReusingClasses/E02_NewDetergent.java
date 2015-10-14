package thinkinginjava.chapter7ReusingClasses;
/**
 *  E02_NewDetergent.java
 *  Description:
 *  
 *  CreateDate: 2015年10月13日 下午3:01:13 
 * 
 *  @author 马宁波
 */

class NewDetergent extends Detergent{
	public void scrub(){
		append(" NewDetergent.scrub()");
		super.scrub();//Doesn't have to be first
	}
	public void sterilize(){append(" sterilize()");}
}

public class E02_NewDetergent {
	public static void main(String[] args) {
		NewDetergent nd = new NewDetergent();
		nd.dilute();
		nd.scrub();
		nd.sterilize();
		System.out.println(nd);
	}
}
