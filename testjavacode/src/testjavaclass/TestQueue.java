package testjavaclass;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 *  TestQueue.java
 *  Description:
 *  
 *  CreateDate: 2016年2月3日 下午2:51:30 
 * 
 *  @author 马宁波
 */
public class TestQueue {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(2);
		queue.offer(3);
		System.out.println(Arrays.toString(queue.toArray()));
		System.out.println(queue.isEmpty());
		System.out.println(queue.peek()+" "+queue.poll());
		System.out.println(Arrays.toString(queue.toArray()));
	}
}
