package util.xml;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import util.EntityObject.FileEntity;

/**
 * XmlUtil.java Description:
 * 参考链接：http://blog.csdn.net/zhao19861029/article/details/8473245
 * CreateDate:
 * 2015年12月23日 下午1:21:30
 * 
 * @author 马宁波
 * @param <T>
 */
public class XmlUtil<T> {
	public static void main(String[] args) {
		XmlUtil<FileEntity> xmlutil = new XmlUtil<FileEntity>();
//		List<FileEntity> files = new ArrayList<FileEntity>();
//		FileEntity file1 = new FileEntity("11","ddd",2);
//		file1.setId(1);
//		files.add(file1);
//		xmlutil.writeXmlDocument(FileEntity.class, files, "UTF-8", "C:/Users/maningbo/Desktop/ddddd.xml");
		List<FileEntity> getfiles = xmlutil.readXML("C:/Users/maningbo/Desktop/ddddd.xml", FileEntity.class);
		for (FileEntity fileEntity : getfiles) {
			System.out.println(fileEntity.getId()+fileEntity.getName()+fileEntity.getAbsolutePath()+fileEntity.getIsFile());
		}
	}

	/**
	 * DMO4J写入XML
	 * @param <T>
	 * @param obj 泛型对象
	 * @param entityPropertys 泛型对象的List集合
	 * @param Encode XML自定义编码类型(推荐使用GBK)
	 * @param XMLPathAndName XML文件的路径及文件名
	 */
	public void writeXmlDocument(Class<T> type, List<T> entityPropertys, String Encode,
			String XMLPathAndName) {
		long lasting = System.currentTimeMillis();// 效率检测
		try {
			XMLWriter writer = null;// 声明写XML的对象
			OutputFormat format = OutputFormat.createPrettyPrint();
			format.setEncoding(Encode);// 设置XML文件的编码格式

			String filePath = XMLPathAndName;// 获得文件地址
			File file = new File(filePath);// 获得文件
			if (file.exists()) {
				file.delete();
			}
			// 新建student.xml文件并新增内容
			Document document = DocumentHelper.createDocument();
			String rootname = type.getSimpleName();// 获得类名
			Element root = document.addElement(rootname + "s");// 添加根节点
			Field[] properties = type.getDeclaredFields();// 获得实体类的所有属性
			for (T t : entityPropertys) { // 递归实体
				Element secondRoot = root.addElement(rootname); // 二级节点
				for (int i = 0; i < properties.length; i++) {
					// 反射get方法
					Method meth = t.getClass().getMethod(
							"get"
									+ properties[i].getName().substring(0, 1)
											.toUpperCase()
									+ properties[i].getName().substring(1));
					// 为二级节点添加属性，属性值为对应属性的值
					secondRoot.addElement(properties[i].getName()).setText(
							meth.invoke(t).toString());
				}
			}
			System.out.println(document.asXML());
			// 生成XML文件
			writer = new XMLWriter(new FileWriter(file), format);
			writer.write(document);
			writer.close();
			long lasting2 = System.currentTimeMillis();
			System.out.println("写入XML文件结束,用时" + (lasting2 - lasting) + "ms");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("XML文件写入失败");
		}
	}

	/**  
	 * @param XMLPathAndName XML文件的路径和地址
	 * @param t     泛型对象
	 * @return
	 */ 
	@SuppressWarnings("unchecked")
	public List<T> readXML(String XMLPathAndName, Class<T> type) {
		long lasting = System.currentTimeMillis();// 效率检测
		List<T> list = new ArrayList<T>();// 创建list集合
		try {
			File f = new File(XMLPathAndName);// 读取文件
			SAXReader reader = new SAXReader();
			Document doc = reader.read(f);// dom4j读取
			System.out.println(doc.asXML());
			Element root = doc.getRootElement();// 获得根节点
			Element foo;// 二级节点
			Field[] properties = type.getDeclaredFields();// 获得实例的属性
			// 实例的set方法
			Method setmeth;
			for (Iterator<T> i = root.elementIterator(type
					.getSimpleName()); i.hasNext();) {// 遍历t.getClass().getSimpleName()节点
				foo = (Element) i.next();// 下一个二级节点
				T t = type.newInstance();// 获得对象的新的实例
				for (int j = 0; j < properties.length; j++) {// 遍历所有孙子节点
					// 实例的set方法
					setmeth = t.getClass().getMethod(
							"set"
									+ properties[j].getName().substring(0, 1)
											.toUpperCase()
									+ properties[j].getName().substring(1),
							properties[j].getType());
					System.out.println(setmeth.getName());
					System.out.println(setmeth.getParameterTypes()[0]);
					// properties[j].getType()为set方法入口参数的参数类型(Class类型)
					if((setmeth.getParameterTypes()[0].toString()).indexOf("java.lang.Integer")>-1){
						setmeth.invoke(t, Integer.parseInt(foo.elementText(properties[j].getName())));// 将对应节点的值存入
					}else if((setmeth.getParameterTypes()[0].toString()).indexOf("java.lang.String")>-1){
						setmeth.invoke(t, foo.elementText(properties[j].getName()));// 将对应节点的值存入
					}
				}
				list.add(t);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		long lasting2 = System.currentTimeMillis();
		System.out.println("读取XML文件结束,用时" + (lasting2 - lasting) + "ms");
		return list;
	}
}
