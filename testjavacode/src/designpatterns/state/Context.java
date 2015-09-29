package designpatterns.state;
/**
 *  Context.java
 *  Description:
 *  
 *  CreateDate: 2015年9月29日 上午9:25:24 
 * 
 *  @author 马宁波
 */
public class Context {
	private State state;
	public Context(State state){
		this.state = state;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public void method(){
		if(null==state.getValue()){
			System.out.println("未设置状态！");
		}else if("state1".equals(state.getValue())){
			state.method1();
		}else if("state2".equals(state.getValue())){
			state.method2();
		}else{
			System.out.println("没有对应状态的方法！");
		}
	}
}
