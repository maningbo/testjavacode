package designpatterns.visitor;
/**
 *  MyVisitor.java
 *  Description:
 *  
 *  CreateDate: 2015年9月29日 上午9:57:18 
 * 
 *  @author 马宁波
 */
public class MyVisitor implements Visitor {

	@Override
	public void visit(Subject subject) {
		System.out.println("visit this subject:"+subject.getSubject());
	}

}
