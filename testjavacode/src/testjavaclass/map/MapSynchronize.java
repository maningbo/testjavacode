package testjavaclass.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * MapSynchronize.java Description:
 * 
 * CreateDate: 2015年9月18日 下午4:45:27
 * 
 * @author 马宁波
 */
public class MapSynchronize {
	public static final int THREAD_COUNT = 1;
	public static final int MAP_SIZE = 1000;
	public static final int EXECUTION_MILLES = 1000;
	public static final int[] KEYS = new int[100];

	public static void main(String[] args) throws Exception {
		// 初始化
		Random rand = new Random();
		for (int i = 0; i < KEYS.length; ++i) {
			KEYS[i] = rand.nextInt();
		}

		// 创建线程
		long start = System.currentTimeMillis();
		Thread[] threads = new Thread[THREAD_COUNT];
		for (int i = 0; i < THREAD_COUNT; ++i) {
			threads[i] = new UnsafeThread();
			//threads[i] = new SynchronizedThread();
			//threads[i] = new LockThread();
			//threads[i] = new ReadLockThread();
			//threads[i] = new ConcurrentThread();
			threads[i].start();
		}

		// 等待其它线程执行若干时间
		Thread.sleep(EXECUTION_MILLES);

		// 统计 get 操作的次数
		long sum = 0;
		for (int i = 0; i < THREAD_COUNT; ++i) {
			sum += threads[i].getClass().getDeclaredField("count")
					.getLong(threads[i]);
		}
		long millisCost = System.currentTimeMillis() - start;
		System.out.println(sum + "(" + (millisCost) + "ms)");
		System.exit(0);
	}

	public static void fillMap(Map<Integer, Integer> map) {
		Random rand = new Random();
		for (int i = 0; i < MAP_SIZE; ++i) {
			map.put(rand.nextInt(), rand.nextInt());
		}
	}
}

class UnsafeThread extends Thread {
	private static Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	public long count = 0;

	static {
		MapSynchronize.fillMap(map);
	}

	public void run() {
		for (;;) {//相当于while(true)
			int index = (int) (count % MapSynchronize.KEYS.length);
			map.get(MapSynchronize.KEYS[index]);
			++count;
		}
	}
}

class SynchronizedThread extends Thread {
	private static Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	public long count = 0;

	static {
		MapSynchronize.fillMap(map);
	}

	public void run() {
		for (;;) {
			int index = (int) (count % MapSynchronize.KEYS.length);
			synchronized (SynchronizedThread.class) {
				map.get(MapSynchronize.KEYS[index]);
			}
			++count;
		}
	}
}

class LockThread extends Thread {
	private static Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	private static Lock lock = new ReentrantLock();
	public long count = 0;

	static {
		MapSynchronize.fillMap(map);
	}

	public void run() {
		for (;;) {
			int index = (int) (count % MapSynchronize.KEYS.length);
			lock.lock();
			map.get(MapSynchronize.KEYS[index]);
			lock.unlock();
			++count;
		}
	}
}

class ReadLockThread extends Thread {
	private static Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	private static Lock lock = new ReentrantReadWriteLock().readLock();
	public long count = 0;

	static {
		MapSynchronize.fillMap(map);
	}

	public void run() {
		for (;;) {
			int index = (int) (count % MapSynchronize.KEYS.length);
			lock.lock();
			map.get(MapSynchronize.KEYS[index]);
			lock.unlock();
			++count;
		}
	}
}

class ConcurrentThread extends Thread {
	private static Map<Integer, Integer> map = new ConcurrentHashMap<Integer, Integer>();
	public long count = 0;

	static {
		MapSynchronize.fillMap(map);
	}

	public void run() {
		for (;;) {
			int index = (int) (count % MapSynchronize.KEYS.length);
			map.get(MapSynchronize.KEYS[index]);
			++count;
		}
	}
}