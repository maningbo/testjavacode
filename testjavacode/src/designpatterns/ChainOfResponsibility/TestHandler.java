package designpatterns.ChainOfResponsibility;
/**
 *  TestHandler.java
 *  Description:
 *  
 *  CreateDate: 2015年9月28日 下午4:15:09 
 * 
 *  @author 马宁波
 */
public class TestHandler {
	/**/
	public static void main(String[] args) {
		MyHandler h1 = new MyHandler("h1");
		MyHandler h2 = new MyHandler("h2");
		MyHandler h3 = new MyHandler("h3");
		h1.setHandler(h2);
		h2.setHandler(h3);
		h1.operator();
	}
}
