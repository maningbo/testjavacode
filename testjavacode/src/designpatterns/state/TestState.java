package designpatterns.state;
/**
 *  TestState.java
 *  Description:
 *  
 *  CreateDate: 2015年9月29日 上午9:25:33 
 * 
 *  @author 马宁波
 */
public class TestState {
	/* 根据这个特性，状态模式在日常开发中用的挺多的，尤其是做网站的时候，
	 * 我们有时希望根据对象的某一属性，区别开他们的一些功能，比如说简单的权限控制等*/
	public static void main(String[] args) {
		State state = new State();
		Context context = new Context(state);
		context.method();
		//设置状态1
		state.setValue("state1");
		context.method();
		//设置状态2
		state.setValue("state2");
		context.method();
		//设置状态3
		state.setValue("state3");
		context.method();
	}
}
