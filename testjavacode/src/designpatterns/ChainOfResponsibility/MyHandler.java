package designpatterns.ChainOfResponsibility;
/**
 *  MyHandler.java
 *  Description:
 *  
 *  CreateDate: 2015年9月28日 下午4:10:25 
 * 
 *  @author 马宁波
 */
public class MyHandler extends AbstractHandler implements Handler {
	private String name;
	public MyHandler(String name){
		this.name = name;
	}
	@Override
	public void operator() {
		System.out.println(name + "deal!");
		MyHandler temp = (MyHandler) getHandler();
		if(getHandler()!=null && temp!=this){
			getHandler().operator();
		}
	}

}
