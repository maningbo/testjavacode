package testJDBC;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *  TestReadProperties.java
 *  Description:
 *  
 *  CreateDate: 2015年7月22日 下午3:15:42 
 * 
 *  @author 马宁波
 */
public class TestReadProperties {

	public static void main(String[] args) {
		Properties p = null;
		InputStream fis = null;
		try {
			p = new Properties();
			fis = new FileInputStream(TestReadProperties.class.getResource(".").getPath()+"db.properties");
//			fis = TestReadProperties.class.getClassLoader().getResourceAsStream("db.properties");
			System.out.println(TestReadProperties.class.getResource(".").getPath());
			System.out.println(TestReadProperties.class.getResource("/").getPath());
			p.load(fis);
			System.out.println(p.getProperty("db.driver", ""));
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(null!=fis){
					fis.close();
				}
				p = null;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
