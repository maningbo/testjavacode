package designpatterns.flyweight;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
	
    public MySQLJDBCUtil() throws SQLException{//创建对象时就建立连接
    	conn = ConnectionPool.getInstance().getConnection();
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
