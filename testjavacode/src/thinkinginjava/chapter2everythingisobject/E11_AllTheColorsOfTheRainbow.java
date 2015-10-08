package thinkinginjava.chapter2everythingisobject;
/**
 *  E11_AllTheColorsOfTheRainbow.java
 *  Description:
 *  
 *  CreateDate: 2015年10月8日 上午10:04:19 
 * 
 *  @author 马宁波
 */
public class E11_AllTheColorsOfTheRainbow {
	int anIngegerRepresentingColors;
	void changeTheHueOfTheColor(int newHue){
		anIngegerRepresentingColors = newHue;
	}
	public static void main(String[] args){
		E11_AllTheColorsOfTheRainbow all = 
				new E11_AllTheColorsOfTheRainbow();
		all.changeTheHueOfTheColor(23);
		System.out.println(all.anIngegerRepresentingColors);
	}
}
