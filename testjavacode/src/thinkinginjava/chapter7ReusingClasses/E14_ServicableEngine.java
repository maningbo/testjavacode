package thinkinginjava.chapter7ReusingClasses;
/**
 *  E14_ServicableEngine.java
 *  Description:
 *  
 *  CreateDate: 2015年10月13日 下午5:00:57 
 * 
 *  @author 马宁波
 */

class Engine{}
class Wheel{
	public void inflate(int i){
		System.out.println("inflate()"+i);
	}
}
class Window{
	public void rollup(){
		System.out.println("rollup()");
	}
}
class Door{
	public Window window = new Window();
}

class ServicableEngine extends Engine{
	public void service(){
		System.out.println("ServicableEngine service()");
	}
}

class ServicableCar{
	public ServicableEngine engine = new ServicableEngine();
	public Wheel[] wheel = new Wheel[4];
	public Door left = new Door(),right = new Door();//2-door
	public ServicableCar(){
		for (int i = 0; i < wheel.length; i++) {
			wheel[i] = new Wheel();
		}
	}
}

public class E14_ServicableEngine {
	public static void main(String[] args) {
		ServicableCar car = new ServicableCar();
		car.left.window.rollup();
		car.wheel[0].inflate(55);
		car.engine.service();
	}
}
