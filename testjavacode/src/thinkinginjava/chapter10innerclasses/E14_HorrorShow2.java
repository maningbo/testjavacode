package thinkinginjava.chapter10innerclasses;
/**
 *  E14_HorrorShow2.java
 *  Description:
 *  
 *  CreateDate: 2015年11月5日 上午8:19:51 
 * 
 *  @author 马宁波
 */
public class E14_HorrorShow2 {
	public static void main(String[] args) {
		DangerousMonster barney = new DangerousMonster(){
			public void menace(){}
			public void destory(){}
		};
		HorrorShow.u(barney);
		HorrorShow.v(barney);
		Vampire vlad = new Vampire() {
			public void kill() {}
			public void menace() {}
			public void destory() {}
			public void drinkBlood() {}
		};
		HorrorShow.u(vlad);
		HorrorShow.v(vlad);
		HorrorShow.w(vlad);
	}
}
