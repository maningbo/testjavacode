package designpatterns.observer;
/**
 *  Subject.java
 *  Description:
 *  
 *  CreateDate: 2015年9月28日 下午2:27:53 
 * 
 *  @author 马宁波
 */
public interface Subject {
	/**
	 * 增加观察者
	 * @param observer
	 */
	public void add(Observer observer);
	/**
	 * 删除观察者
	 * @param observer
	 */
	public void del(Observer observer);
	/**
	 * 通知所有的观察者
	 */
	public void notifyObservers();
	/**
	 * 自身的操作
	 */
	public void operation();
}
