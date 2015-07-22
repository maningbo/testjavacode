package testJDBC;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.Connection;

/**
 *  MySQLJDBC.java
 *  Description:
 *  
 *  CreateDate: 2015年7月22日 上午11:49:55 
 * 
 *  @author 马宁波
 */
public class MySQLJDBCUtil {
	//定义对象
	private PreparedStatement pstmt;
	private Connection conn;
	private ResultSet rs;
	private static String dbdriver = "";
    private static String dburl = "";
    private static String dbusername = "";
    private static String dbpassword = "";
	
    private static void init(){//初始化参数
    	Properties p = null;
		FileInputStream fis = null;
		try {
			p = new Properties();
			fis = new FileInputStream("WebContent/conf/db.properties");
			p.load(fis);
			dbdriver = p.getProperty("db.driver", "");
			dburl = p.getProperty("db.url", "");
			dbusername = p.getProperty("db.username", "");
			dbpassword = p.getProperty("db.password", "");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				fis.close();
				p = null;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
    }
   	static{//加载驱动
   		try {
   			init();
   			Class.forName(dbdriver);
   		} catch (ClassNotFoundException e) {
   			e.printStackTrace();
   		}
   	}
    
    MySQLJDBCUtil() throws SQLException{//创建对象时就建立连接
    	conn = (Connection) DriverManager.getConnection(dburl, dbusername, dbpassword);
    	pstmt = conn.prepareStatement("", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
    }
	
	public void executeUpdate(String sql) throws SQLException{
		// system.out.println(sql);
		pstmt.executeUpdate(sql);
	}

	public ResultSet executeQuery(String sql) throws SQLException{
		// system.out.println(sql);
		rs = pstmt.executeQuery(sql);
		return rs;
	}

	public void close() {
		if (rs != null) {
			try {
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
