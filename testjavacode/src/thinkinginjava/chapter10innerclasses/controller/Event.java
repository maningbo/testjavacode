package thinkinginjava.chapter10innerclasses.controller;
/**
 *  Event.java
 *  Description:
 *  
 *  CreateDate: 2015年11月13日 上午10:29:03 
 * 
 *  @author 马宁波
 */
public abstract class Event {
	private long eventTime;
	protected final long delayTime;
	public Event(long delayTime){
		this.delayTime = delayTime;
		start();
	}
	public void start(){//Allows restarting
		eventTime = System.nanoTime()+delayTime;
	}
	public boolean ready(){
		return System.nanoTime()>=eventTime;
	}
	public abstract void action();
}
