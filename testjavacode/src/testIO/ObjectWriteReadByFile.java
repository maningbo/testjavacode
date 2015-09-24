package testIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import testclone.Dog;
import testclone.Human;

/**
 *  WriteObjectToFile.java
 *  Description:
 *  
 *  CreateDate: 2015年9月24日 下午5:07:25 
 * 
 *  @author 马宁波
 */
public class ObjectWriteReadByFile {
	public static String writeOjbectToFile(Object obj,String filename){
		ObjectOutputStream oos = null;
		try {
			String filepath = new File("").getAbsolutePath()+"\\objects\\"+filename;
			oos = new ObjectOutputStream(new FileOutputStream(new File(filepath)));
			oos.writeObject(obj);
			return filepath;
		} catch (IOException e) {
			e.printStackTrace();
			return "写出失败！";
		}finally{
			try {
				if(null!=oos){
					oos.flush();
					oos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static String readOjbectFromFile(String filepath){
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(new File(filepath)));
			Human human = (Human) ois.readObject();
			System.out.println(human.getDog().getColor());
			return "读取成功";
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			return "读取失败！";
		}finally{
			try {
				if(null!=ois){
					ois.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args){
		//Human human = new Human("小明", "男", 25, new Dog("kk", "yellow"));
		//System.out.println(ObjectWriteReadByFile.writeOjbectToFile(human, "5555"));
		System.out.println(ObjectWriteReadByFile.readOjbectFromFile("D:\\projects\\git\\testjavacode\\testjavacode\\objects\\5555"));
	}
}
