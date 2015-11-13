package thinkinginjava.chapter10innerclasses.controller;

import java.util.ArrayList;
import java.util.List;

/**
 *  Controller.java
 *  Description:
 *  
 *  CreateDate: 2015年11月13日 上午10:26:28 
 * 
 *  @author 马宁波
 */
public class Controller {
	//A class from java.util to hold Event objects:
	private List<Event> eventList = new ArrayList<Event>();
	public void addEvent(Event c){eventList.add(c);}
	public void run(){
		//Make a copy so you're not modifying the list
		//while you're selecting the elements in it:
		for (Event e : new ArrayList<Event>(eventList)) {
			if(e.ready()){
				System.out.println(e);
				e.action();
				eventList.remove(e);
			}
		}
	}
}
