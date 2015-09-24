package testclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *  Human.java
 *  Description:
 *  
 *  CreateDate: 2015年9月24日 下午4:16:51 
 * 
 *  @author 马宁波
 */
public class Human implements Cloneable,Serializable{
	/**
	 * eclipse 自动生成
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String sex;
	private Integer age;
	private Dog dog;
	public Human(String name,String sex,Integer age,Dog dog){
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.dog = dog;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	
	/**
	 * 浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，
	 * 而引用类型，指向的还是原对象所指向的。
	 */
	public Human clone(){
		try {
			return (Human) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 深复制：将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。
	 * 简单来说，就是深复制进行了完全彻底的复制，而浅复制不彻底。
	 */
	public Human deepClone(){
		ByteArrayOutputStream bos = null;
		ObjectOutputStream oos = null;
		ByteArrayInputStream bis = null;
		ObjectInputStream ois = null;
		try {
			//写入当前对象的二进制流
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(this);
			//读出二进制流产生的新对象
			bis = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bis);
			return (Human) ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				if(null!=ois){
					ois.close();
				}
				if(null!=bis){
					bis.close();
				}
				if(null!=oos){
					oos.flush();
					oos.close();
				}
				if(null!=bos){
					bos.flush();
					bos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}