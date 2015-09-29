package designpatterns.visitor;
/**
 *  Subject.java
 *  Description:
 *  
 *  CreateDate: 2015年9月29日 上午9:52:27 
 * 
 *  @author 马宁波
 */
public interface Subject {
	public void accept(Visitor visitor);
	public String getSubject();
}
