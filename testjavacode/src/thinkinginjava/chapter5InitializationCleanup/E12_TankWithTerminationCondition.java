package thinkinginjava.chapter5InitializationCleanup;
/**
 *  E12_TankWithTerminationCondition.java
 *  Description:
 *  
 *  CreateDate: 2015年10月12日 下午1:15:55 
 * 
 *  @author 马宁波
 */

class Tank{
	static int counter;
	int id = counter++;
	boolean full;
	public Tank(){
		System.out.println("Tank "+id+" created");
		full = true;
	}
	public void empty(){
		full = false;
	}
	protected void finalize(){
		if(full){
			System.out.println("Error:tank "+id+" must be empty at cleanup");
		}else{
			System.out.println("Tank "+id+" cleaned up OK");
		}
	}
	public String toString(){
		return "Tank "+id;
	}
}

public class E12_TankWithTerminationCondition {
	public static void main(String[] args) {
		new Tank().empty();
		new Tank();
		//Don't empty the second one
		System.gc();//Force finalization?
		System.runFinalization();
	}
}
