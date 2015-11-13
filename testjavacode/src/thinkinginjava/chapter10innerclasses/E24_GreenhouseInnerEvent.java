package thinkinginjava.chapter10innerclasses;

import thinkinginjava.chapter10innerclasses.controller.Controller;
import thinkinginjava.chapter10innerclasses.controller.Event;

/**
 *  E24_GreenhouseInnerEvent.java
 *  Description:
 *  
 *  CreateDate: 2015年11月13日 上午11:15:34 
 * 
 *  @author 马宁波
 */

class GreenHouseControlsWithFan extends Controller{
	private boolean light = false;
	public class LightOn extends Event{
		public LightOn(long delayTime){super(delayTime);}
		public void action(){
			//Put hardware control code here to
			//physically turn on the light.
			light = true;
		}
		public String toString(){return "Light is on";}
	}
	public class LightOff extends Event{
		public LightOff(long delayTime){super(delayTime);}
		public void action(){
			//Put hardware control code here to
			//physically turn off the light
			light = false;
		}
		public String toString(){return "Light is off";}
	}
	
	private boolean fan = false;
	public class FanOn extends Event{
		public FanOn(long delayTime){super(delayTime);}
		public void action(){
			//Put hardware control code here to
			//physically turn on the Fan.
			fan = true;
		}
		public String toString(){return "Fan is on";}
	}
	public class FanOff extends Event{
		public FanOff(long delayTime){super(delayTime);}
		public void action(){
			//Put hardware control code here to
			//physically turn off the Fan.
			fan = false;
		}
		public String toString(){return "Fan is off";}
	}
	
	private boolean water = false;
	public class WaterOn extends Event{
		public WaterOn(long delayTime){super(delayTime);}
		public void action(){
			//Put hardware control code here to
			//physically turn on the Water.
			water = true;
		}
		public String toString(){return "Water is on";}
	}
	public class WaterOff extends Event{
		public WaterOff(long delayTime){super(delayTime);}
		public void action(){
			//Put hardware control code here to
			//physically turn off the Water.
			water = false;
		}
		public String toString(){return "Water is off";}
	}
	
	private String thermostat = "Day";
	public class ThermostatNight extends Event{
		public ThermostatNight(long delayTime){super(delayTime);}
		public void action(){
			//Put hardware control code here.
			thermostat = "Night";
		}
		public String toString(){return "Thermostat on night setting";}
	}
	public class ThermostatDay extends Event{
		public ThermostatDay(long delayTime){super(delayTime);}
		public void action(){
			//Put hardware control code here.
			thermostat = "Day";
		}
		public String toString(){return "Thermostat on day setting";}
	}
	
	//An example of an action() that inserts a 
	//new one of itself into the event list:
	public class Bell extends Event{
		public Bell(long delayTime){super(delayTime);}
		public void action(){
			addEvent(new Bell(delayTime));
		}
		public String toString(){return "Bing!";}
	}
	public class Restart extends Event{
		private Event[] eventList;
		public Restart(long delayTime,Event[] eventList){
			super(delayTime);
			this.eventList = eventList;
			for (Event e : eventList) {
				addEvent(e);
			}
		}
		public void action(){
			for (Event e : eventList) {
				e.start();//Rerun each event
				addEvent(e);
			}
			start();//Rerun this Event
			addEvent(this);
		}
		public String toString(){
			return "Restarting system";
		}
	}
	public static class Terminate extends Event{
		public Terminate(long delayTime){super(delayTime);}
		public void action(){System.exit(0);}
		public String toString(){return "Terminating";}
	}
}

public class E24_GreenhouseInnerEvent {
	public static void main(String[] args) {
		args = new String[]{"10"};
		GreenHouseControlsWithFan gc = 
				new GreenHouseControlsWithFan();
		//Instead of hard-wirting.you could parse
		//configuration information from a text file here:
		gc.addEvent(gc.new Bell(900));
		Event[] eventList = {
			gc.new ThermostatNight(0),
			gc.new LightOn(200),
			gc.new FanOn(300),
			gc.new LightOff(400),
			gc.new FanOff(500),
			gc.new WaterOn(600),
			gc.new WaterOff(800),
			gc.new ThermostatDay(1400)
		};
		gc.addEvent(gc.new Restart(2000, eventList));
		if(args.length==1){
			gc.addEvent(new GreenHouseControlsWithFan
					.Terminate(new Integer(args[0])));
		}
		gc.run();
	}
}
