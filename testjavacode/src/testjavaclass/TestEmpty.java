package testjavaclass;

/**
 * TestEmpty.java<br>
 * Description:<br>
 * <br>
 * CreateDate: 2016年4月13日 上午9:48:31
 * 
 * @author 马宁波
 */
public class TestEmpty {
	public static void main(String[] args) {
		String test = null;
		//System.out.println(test.isEmpty());//空指针异常
		test = "";
		System.out.println(test.isEmpty());//true
	}
}
