package testJDBC;

import java.sql.SQLException;

/**
 *  TestJdbc.java
 *  Description:
 *  
 *  CreateDate: 2015年7月22日 下午5:08:23 
 * 
 *  @author 马宁波
 */
public class TestJdbc {

	public static void main(String[] args) {
		MySQLJDBCUtil mysqljdbcutil = null;
		try {
			mysqljdbcutil = new MySQLJDBCUtil();
			mysqljdbcutil.executeUpdate("DROP TABLE IF EXISTS `student`");
			mysqljdbcutil.executeUpdate("CREATE TABLE `student` ("
					+ "`id` int(11) NOT NULL AUTO_INCREMENT,"
					+ "`name` varchar(50),"
					+ "`age` int(11) DEFAULT '0',"
					+ "`sex` varchar(20),"
					+ "PRIMARY KEY (`id`)"
					+ ") ENGINE=InnoDB DEFAULT CHARSET=utf8");
			System.out.println("创建成功！");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(null!=mysqljdbcutil){
				mysqljdbcutil.close();
			}
		}
		
	}
}
