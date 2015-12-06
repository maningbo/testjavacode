package teststructure.thread;

import java.util.Vector;

/**
 *  TestSynchronized.java
 *  Description:
 *  
 *  CreateDate: 2015年7月21日 上午10:21:04 
 * 
 *  @author 马宁波
 */
public class TestSynchronized {
	public Object method (Object o) {
		return o;
    }
	private void test () {
		vector.add(0);
		vector.add(1);
		vector.add(0, 9);
		synchronized(TestSynchronized.class){//在一个同步块中执行非同步方法,避免循环中使用同步方法
            for (int i = 0; i < vector.size(); i++) {
                System.out.println(method (vector.elementAt(i)));
            }
        }
    }
    private Vector<Integer> vector = new Vector<Integer>(5, 5);
	public static void main(String[] args) {
		new TestSynchronized().test();
	}
}
