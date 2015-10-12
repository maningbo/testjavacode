package thinkinginjava.chapter5InitializationCleanup;
/**
 *  E22_PaperCurrencyTypesEnum2.java
 *  Description:
 *  
 *  CreateDate: 2015年10月12日 下午2:41:15 
 * 
 *  @author 马宁波
 */
public class E22_PaperCurrencyTypesEnum2 {
	static void describe(PaperCurrencyTypes pct){
		System.out.print(pct+" has a portrait of ");
		switch(pct){
			case ONE:
				System.out.println("George Washington");
				break;
			case TWO:
				System.out.println("Thomas Jefferson");
				break;
			case FIVE:
				System.out.println("Abraham LinColn");
				break;
			case TEN:
				System.out.println("Alexander Hamiliton");
				break;
			case TWENTY:
				System.out.println("Andrew Jackson");
				break;
			case FIFTY:
				System.out.println("U.S. Grant");
				break;
			default:
				System.out.println("default");
		}
	}
	public static void main(String[] args) {
		for (PaperCurrencyTypes s : PaperCurrencyTypes.values()) {
			describe(s);
		}
	}
}
