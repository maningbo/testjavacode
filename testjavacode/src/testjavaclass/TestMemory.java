package testjavaclass;

/**
 * TestMemory.java Description:
 * 
 * CreateDate: 2015年11月5日 上午9:22:33
 * 
 * @author 马宁波
 */
public class TestMemory {

	public static String toMemoryInfo() {
		Runtime currRuntime = Runtime.getRuntime();
		int nFreeMemory = (int) (currRuntime.freeMemory() / 1024 / 1024);
		int nTotalMemory = (int) (currRuntime.totalMemory() / 1024 / 1024);
		return nFreeMemory + "M/" + nTotalMemory + "M(free/total)";
	}

	public static void main(String[] args) {
		System.out.println("内存信息：" + toMemoryInfo());
	}
}
