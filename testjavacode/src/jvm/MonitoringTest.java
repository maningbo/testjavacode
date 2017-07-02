package jvm;

import java.util.ArrayList;
import java.util.List;

/**
 *  OOMObject.java<br>
 *  Description:<br>
 *  周志明，深入理解java虚拟机，第二版，第117页<br>
 *  CreateDate: 2017年7月2日 下午2:52:40
 *  @author 马宁波
 */
public class MonitoringTest {
	/**
	 * 内存占位符对象，一个OOMObject大约占64K
	 * @author maningbo
	 */
	static class OOMObject {
		public byte[] placeHolder = new byte[64*1024];
	}
	
	public static void fillHeap(int num) throws InterruptedException {
		List<OOMObject> list = new ArrayList<OOMObject>();
		for (int i = 0; i < num; i++) {
			//稍作延时，令监控曲线的变化更加明显
			Thread.sleep(50);
			list.add(new OOMObject());
		}
		System.gc();
	}
	
	public static void main(String[] args) throws Exception {
		fillHeap(1000);
	}
}

