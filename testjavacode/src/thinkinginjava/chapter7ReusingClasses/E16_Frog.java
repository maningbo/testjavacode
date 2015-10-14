package thinkinginjava.chapter7ReusingClasses;
/**
 *  E16_Frog.java
 *  Description:
 *  
 *  CreateDate: 2015年10月13日 下午5:23:18 
 * 
 *  @author 马宁波
 */

class Amphibian{
	public void moveInWater(){
		System.out.println("Moving in Water");
	}
	public void moveOnLand(){
		System.out.println("Moving on Land");
	}
}

class Frog extends Amphibian{
	public void moveInWater(){
		System.out.print("Frog ");
		super.moveInWater();
	}
	public void moveOnLand(){
		System.out.print("Frog ");
		super.moveOnLand();
	}
}

public class E16_Frog {
	public static void main(String[] args) {
		Amphibian a = new Frog();
		a.moveInWater();
		a.moveOnLand();
	}
}
