package designpatterns.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 *  AbstractSubject.java
 *  Description:
 *  
 *  CreateDate: 2015年9月28日 下午2:38:09 
 * 
 *  @author 马宁波
 */
public abstract class AbstractSubject implements Subject{

	private Vector<Observer> observers = new Vector<Observer>();
	
	@Override
	public void add(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void del(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		Enumeration<Observer> enumeration = observers.elements();
		while(enumeration.hasMoreElements()){
			enumeration.nextElement().update();
		}
	}
	
}
