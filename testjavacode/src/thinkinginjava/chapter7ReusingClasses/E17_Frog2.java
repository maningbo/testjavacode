package thinkinginjava.chapter7ReusingClasses;
/**
 *  E16_Frog.java
 *  Description:
 *  
 *  CreateDate: 2015年10月13日 下午5:23:18 
 * 
 *  @author 马宁波
 */

class Frog2 extends Amphibian{
	public void moveInWater(){
		System.out.print("Frog(swimming) ");
		super.moveInWater();
	}
	public void moveOnLand(){
		System.out.print("Frog(jumping) ");
		super.moveOnLand();
	}
}

public class E17_Frog2 {
	public static void main(String[] args) {
		Amphibian a = new Frog2();
		a.moveInWater();
		a.moveOnLand();
	}
}
