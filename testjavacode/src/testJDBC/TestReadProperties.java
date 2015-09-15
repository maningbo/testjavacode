package testJDBC;

import java.io.File;
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
			p.load(fis);
			System.out.println(p.getProperty("db.driver", ""));
			//测试获取项目的绝对路径开始
			//获取TestReadProperties类的绝对路径
			System.out.println(TestReadProperties.class.getResource(".").getPath());
			//获取TestReadProperties类的绝对路径
			System.out.println(TestReadProperties.class.getResource("").getPath());
			//获取ClassPath的绝对路径
			System.out.println(TestReadProperties.class.getResource("/").getPath());
			//获取项目的绝对路径，tomcat下获取的为tomcat安装路径(测试环境时tomcat6)，
			//还需具体测试看，可能是安装目录下的bin目录
			System.out.println("项目根目录的绝对路径-----"+(new File("")).getAbsolutePath());
			//jsp与servlet使用getServletContext().getRealPath("/")获得项目根目录绝对路径
			//测试获取项目的绝对路径结束
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
