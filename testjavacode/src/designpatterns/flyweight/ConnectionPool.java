package designpatterns.flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

/**
 * ConnectionPool.java Description:
 * 
 * CreateDate: 2015年9月28日 上午10:28:23
 * 
 * @author 马宁波
 */

public class ConnectionPool {

	private Vector<Connection> pool;

	/* 公有属性 */
	private String url = "jdbc:mysql://localhost:3306/maningbo";
	private String username = "maningbo";
	private String password = "maningbo";
	private String driverClassName = "com.mysql.jdbc.Driver";

	private int poolSize = 100;
	private static ConnectionPool instance = null;
	Connection conn = null;

	/* 构造方法，做一些初始化工作 */
	private ConnectionPool() {
		pool = new Vector<Connection>(poolSize);

		for (int i = 0; i < poolSize; i++) {
			try {
				Class.forName(driverClassName);
				conn = DriverManager.getConnection(url, username, password);
				pool.add(conn);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/* 返回连接到连接池 */
	public synchronized void release() {
		pool.add(conn);
	}

	/* 返回连接池中的一个数据库连接 */
	public synchronized Connection getConnection() {
		if (pool.size() > 0) {
			Connection conn = pool.get(0);
			pool.remove(conn);
			return conn;
		} else {
			return null;
		}
	}
	
	/**
	 * 加锁的方法防止多线程环境下创建出多个实例
	 */
	private static synchronized void synInit(){
		if(instance==null){
			instance = new ConnectionPool();
		}
	}
	
	/**
	 * 静态工程方法，创建实例
	 */
	public static ConnectionPool getInstance(){
		if(instance==null){
			synInit();
		}
		return instance;
	}
}
