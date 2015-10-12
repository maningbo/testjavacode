package thinkinginjava.chapter5InitializationCleanup;
/**
 *  E21_PaperCurrencyTypesEnum.java
 *  Description:
 *  
 *  CreateDate: 2015年10月12日 下午2:29:56 
 * 
 *  @author 马宁波
 */

enum PaperCurrencyTypes{
	ONE,TWO,FIVE,TEN,TWENTY,FIFTY
}

public class E21_PaperCurrencyTypesEnum {
	public static void main(String[] args) {
		for (PaperCurrencyTypes s : PaperCurrencyTypes.values()) {
			System.out.println(s+",ordinal "+s.ordinal());
		}
	}
}
