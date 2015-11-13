package thinkinginjava.chapter10innerclasses;

import thinkinginjava.chapter10innerclasses.GreenHouseControlsWithFan.FanOff;
import thinkinginjava.chapter10innerclasses.GreenHouseControlsWithFan.FanOn;
import thinkinginjava.chapter10innerclasses.GreenHouseControlsWithFan.LightOff;
import thinkinginjava.chapter10innerclasses.GreenHouseControlsWithFan.LightOn;
import thinkinginjava.chapter10innerclasses.GreenHouseControlsWithFan.ThermostatDay;
import thinkinginjava.chapter10innerclasses.GreenHouseControlsWithFan.ThermostatNight;
import thinkinginjava.chapter10innerclasses.GreenHouseControlsWithFan.WaterOff;
import thinkinginjava.chapter10innerclasses.GreenHouseControlsWithFan.WaterOn;
import thinkinginjava.chapter10innerclasses.controller.Event;

/**
 *  E25_GreenHouseController.java
 *  Description:
 *  
 *  CreateDate: 2015年11月13日 下午1:26:33 
 * 
 *  @author 马宁波
 */

class GreenhouseControlsWithWMG extends GreenHouseControlsWithFan{
	private boolean generator = false;
	public class WatermistGeneratorOn extends Event{
		public WatermistGeneratorOn(long delayTime){super(delayTime);}
		public void action(){
			generator = true;
		}
		public String toString(){
			return "Water mist generator is on";
		}
	}
	public class WatermistGeneratorOff extends Event{
		public WatermistGeneratorOff(long delayTime){
			super(delayTime);
		}
		public void action(){
			generator = false;
		}
		public String toString(){
			return "Water mist generator is off";
		}
	}
}

public class E25_GreenHouseController {
	public static void main(String[] args) {
		args = new String[]{"10"};
		GreenhouseControlsWithWMG gc = new GreenhouseControlsWithWMG();
		//Instead of hard-wiring.you could parse
		//configuration information from a text file here:
		gc.addEvent(gc.new Bell(900));
		Event[] eventList = {
			gc.new ThermostatNight(0),
			gc.new LightOn(200),
			gc.new LightOff(400),
			gc.new WaterOn(600),
			gc.new WaterOff(800),
			gc.new ThermostatDay(1400),
			gc.new WatermistGeneratorOn(1600),
			gc.new WatermistGeneratorOff(1800)
		};
		gc.addEvent(gc.new Restart(2000,eventList));
		if(args.length==1){
			gc.addEvent(new GreenHouseControlsWithFan
					.Terminate(new Integer(args[0])));
		}
		gc.run();
	}
}
