package designpatterns.visitor;
/**
 *  MySubject.java
 *  Description:
 *  
 *  CreateDate: 2015年9月29日 上午9:58:44 
 * 
 *  @author 马宁波
 */
public class MySubject implements Subject {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);

	}

	@Override
	public String getSubject() {
		return "Love";
	}

}
