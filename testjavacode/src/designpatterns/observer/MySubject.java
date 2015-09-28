package designpatterns.observer;
/**
 *  MySubject.java
 *  Description:
 *  
 *  CreateDate: 2015年9月28日 下午2:44:24 
 * 
 *  @author 马宁波
 */
public class MySubject extends AbstractSubject{

	@Override
	public void operation() {
		System.out.println("update self!");
		notifyObservers();
	}

}
