package designpatterns.singleton;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *  Singleton.java
 *  Description:
 *  
 *  CreateDate: 2015年9月18日 下午1:31:59 
 * 
 *  @author 马宁波
 */
public class Singleton {
	/**
	 * 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载
	 */
	private static Singleton instance = null;
	
	private String properties = "";
	
	public String getProperties(){
		return properties;
	}
	
	/**
	 * 采用"影子实例"的办法为单例对象的属性同步更新
	 */
	public void updateProperties(){
		//Load updated configuration information by new a Singleton object
		//影子实例,为单例对象的属性同步更新
		Singleton shadow = new Singleton();
		properties = shadow.getProperties();
	}
	
	/**
	 * 私有构造方法，防止被实例化，同时加载配置文件到单例对象中
	 */
	private Singleton(){
		//Load configuration information from DB or file
		//Set values for properties
		Properties p = null;
		InputStream fis = null;
		try {
			p = new Properties();
			fis = new FileInputStream(Singleton.class.getResource(".").getPath()+"db.properties");
			p.load(fis);
			properties = p.getProperty("db.environment", "");
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
	
	/**
	 * 加锁的方法防止多线程环境下创建出多个实例
	 */
	private static synchronized void synInit(){
		if(instance==null){
			instance = new Singleton();
		}
	}
	
	/**
	 * 静态工程方法，创建实例
	 */
	public static Singleton getInstance(){
		if(instance==null){
			synInit();
		}
		return instance;
	}
	
	/**
	 * 如果该对象被用于序列化，可以保证对象在序列化前后保持一致
	 */
	public Object readResolve(){
		return instance;
	}
}
